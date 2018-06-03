package cyc.tinyqnar.seller.seller.Domain;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_order")
@Data
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column()
    @JoinColumn(name = "id", nullable = false)
    private int ticket_id;



    @Column()
    private String deal_date;

}
