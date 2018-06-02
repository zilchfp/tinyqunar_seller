package cyc.tinyqnar.seller.seller.Domain;


import javax.persistence.*;

@Entity
@Table(name="tbl_ticket")
public class Ticket {

    @Id
    @GeneratedValue
    private int id;

    @Column()
    private String start;

    @Column
    private String end;


    @Column
    private String data;

    @Column
    private int time_hour;

    @Column
    private int time_minute;

    @Column
    private int amount;


}
