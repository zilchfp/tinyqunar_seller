package cyc.tinyqnar.seller.seller.Repository;

import cyc.tinyqnar.seller.seller.Domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface OrderRepository extends JpaRepository<Order, Long> {

    // 增
    // 改

    // 删
    public int deleteById(int id);

    // 查
    public List<Order> findAllBy();

    public Order findById(int id);



}
