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

    //增  加票
    @RequestMapping(value = "/ticket/add", method = {RequestMethod.POST, RequestMethod.GET})
    public Ticket AddTicket(@RequestBody String ticket) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Ticket t = mapper.readValue(ticket, Ticket.class);
        return ticketService.updateTicket(t);
    }


    //改 机票修改
    //买票
    @RequestMapping(value = "/ticket/buy", method = RequestMethod.POST)
    public boolean BuyTicket(@RequestParam(value = "id")int ticketid) {
        Ticket ticket = ticketService.findByTicketID(ticketid);
        if (ticket.getAmount() == 0) {
            return false;
        }
        int oriNum = ticket.getAmount();
        ticket.setAmount(oriNum-1);
        ticketService.updateTicket(ticket);
        return true;
    }

    //删
    @RequestMapping(value = "/ticket/delete", method = RequestMethod.POST)
    public int TicketDelete(@RequestParam(value = "id")int id) {
        return ticketService.deleteById(id);
    }

    //查
    @RequestMapping("/ticket/query")
    public List<Ticket> QueryTicketAvaliable() {
        return ticketService.findAllAvaliable();
    }

    @RequestMapping(value = "/ticket/query/start", method = RequestMethod.POST)
    public List<Ticket> QueryTicketByStart(@RequestParam(value = "search_start")String start) {
        return ticketService.findAllByStart(start);
    }

    @RequestMapping(value = "/ticket/query/end", method = RequestMethod.POST)
    public List<Ticket> QueryTicketByEnd(@RequestParam(value = "search_end")String end) {
        return ticketService.findAllByEnd(end);
    }

    @RequestMapping(value = "/ticket/query/both", method = RequestMethod.POST)
    public List<Ticket> QueryTicketBoth(@RequestParam(value = "search_start")String start,
                                        @RequestParam(value = "search_end")String end) {
        return ticketService.findAllByStartAndEnd(start, end);
    }



}