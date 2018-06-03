package cyc.tinyqnar.seller.seller.Service;

import cyc.tinyqnar.seller.seller.Domain.Order;
import cyc.tinyqnar.seller.seller.Repository.OrderRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order findByID(int id) {
        Order order = orderRepository.findByID(String.valueOf(id    ));
        return order;

    }
}
