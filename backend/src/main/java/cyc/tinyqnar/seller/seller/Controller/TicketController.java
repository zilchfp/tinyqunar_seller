package cyc.tinyqnar.seller.seller.Controller;

import cyc.tinyqnar.seller.seller.Domain.Order;
import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Service.OrderService;
import cyc.tinyqnar.seller.seller.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/ticket/query")
    public List<Ticket> OrderFind() {
        List<Ticket> restTicketList = ticketService.findRestTickets();
        if (restTicketList == null) {
            System.out.println("null");
        }
        return restTicketList;
    }


}