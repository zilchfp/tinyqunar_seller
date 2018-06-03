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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime_hour() {
        return time_hour;
    }

    public void setTime_hour(int time_hour) {
        this.time_hour = time_hour;
    }

    public int getTime_minute() {
        return time_minute;
    }

    public void setTime_minute(int time_minute) {
        this.time_minute = time_minute;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
