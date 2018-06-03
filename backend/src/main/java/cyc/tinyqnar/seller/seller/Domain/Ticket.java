package cyc.tinyqnar.seller.seller.Domain;



import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_ticket")
@Data
public class Ticket {

    @Id
    @GeneratedValue
    private int id;

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




}
