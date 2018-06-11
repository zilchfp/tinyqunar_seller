package cyc.tinyqnar.seller.seller.Controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.kevinsawicki.http.HttpRequest;
import cyc.tinyqnar.seller.seller.Domain.Order;
import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Service.OrderService;
import cyc.tinyqnar.seller.seller.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/order/add", method = {RequestMethod.POST, RequestMethod.GET})
    public Order AddOrder(@RequestBody String ticket) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Ticket t = mapper.readValue(ticket, Ticket.class);
        Order seller_order = orderService.addOrderByTicket(t);
        System.out.println(seller_order.toString());
        Map data = new HashMap();
        String resp = HttpRequest.get("localhost:10003/order/add").form(data).body();
        System.out.println("---------------response parameter:" + resp);
        return seller_order;
    }

    @RequestMapping(value = "/order/query", method = {RequestMethod.POST, RequestMethod.GET})
    public List<Order> QueryOrder() {
        return orderService.findAll();
    }

}
