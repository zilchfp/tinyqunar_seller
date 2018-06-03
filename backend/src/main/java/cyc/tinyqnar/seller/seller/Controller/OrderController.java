package cyc.tinyqnar.seller.seller.Controller;


import cyc.tinyqnar.seller.seller.Domain.Order;
import cyc.tinyqnar.seller.seller.Repository.OrderRepository;
import cyc.tinyqnar.seller.seller.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order")
    public Order OrderFind() {
        Order order = orderService.findByID(1);
        if (order == null) {
            System.out.println("null");
        }
        return order;
    }


}
