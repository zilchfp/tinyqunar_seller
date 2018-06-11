package cyc.tinyqnar.seller.seller.Service;

import cyc.tinyqnar.seller.seller.Domain.Order;
import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // 增
    // 改
    public Order updateOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order addOrderByTicket(Ticket ticket) {
        Order order = new Order(ticket);
        return orderRepository.save(order);
    }



    // 删
    public int deleteById(int id) {
        return orderRepository.deleteById(id);
    }



    // 查
    public Order findByID(int id) {
        Order order = orderRepository.findById(id);
        return order;
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }


}
