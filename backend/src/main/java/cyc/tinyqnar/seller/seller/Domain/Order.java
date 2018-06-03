package cyc.tinyqnar.seller.seller.Domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_order")
@Data
public class Order {


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
    private int quantity;


}
