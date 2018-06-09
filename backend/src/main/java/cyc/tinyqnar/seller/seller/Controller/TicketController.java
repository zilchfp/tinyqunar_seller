package cyc.tinyqnar.seller.seller.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@EnableEurekaServer
@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/ticket/query")
    public List<Ticket> RestTicketQuery() {
        List<Ticket> restTicketList = ticketService.findRestTickets();
        if (restTicketList == null) {
            System.out.println("null");
        }
        return restTicketList;
    }

    @RequestMapping(value = "/ticket/delete", method = RequestMethod.POST)
    public int TicketDelete(@RequestParam(value = "id")int id) {
        System.out.println(id);
        return ticketService.deleteById(id);
    }


    @RequestMapping(value = "/ticket/add", method = {RequestMethod.POST, RequestMethod.GET})
    public Ticket TicketEdit(@RequestBody String ticket) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Ticket t = mapper.readValue(ticket, Ticket.class);
        return ticketService.updateTicket(t);
    }
}