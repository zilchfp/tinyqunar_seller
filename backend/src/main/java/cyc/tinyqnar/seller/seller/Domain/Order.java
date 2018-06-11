package cyc.tinyqnar.seller.seller.Domain;


import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name="tbl_order")
@Data
public class Order {
    public Order() {

    }

    public Order(Ticket ticket) {
        this.id = 0;
        this.ticket_id = ticket.getId();
        this.start = ticket.getStart();
        this.end = ticket.getEnd();
        this.date = ticket.getDate();
        this.time_hour = ticket.getTime_hour();
        this.time_minute = ticket.getTime_minute();
        this.price = ticket.getPrice();
        this.amount = ticket.getAmount();
        this.start_time = ticket.getStart_time();
        long time =  new Date().getTime();
        this.deal_date =  new SimpleDateFormat("yyyy-MM-dd").format(time);
        this.deal_time =  new SimpleDateFormat("HH-mm-ss").format(time);
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    @JoinColumn(name = "ticket_id", nullable = false)
    private int ticket_id;

    @Column()
    private String start;

    @Column
    private String end;

    @Column
    private String date;

    @Column
    private int time_hour;

    @Column
    private int time_minute;

    @Column
    private double price;

    @Column
    private int amount;

    @Column
    private Time start_time;

    @Column
    private String deal_date;

    @Column
    private String deal_time;

}
