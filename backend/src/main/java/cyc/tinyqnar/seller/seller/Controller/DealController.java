package cyc.tinyqnar.seller.seller.Controller;


import com.github.kevinsawicki.http.HttpRequest;
import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Service.OrderService;
import cyc.tinyqnar.seller.seller.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DealController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private TicketService ticketService;

    @RequestMapping(value = "/deal/add", method = {RequestMethod.POST, RequestMethod.GET})
    public int BuyTicket(@RequestParam(value = "id")int ticket_id,
                            @RequestParam(value = "userid")int userid) {
        Ticket t = ticketService.findByTicketID(ticket_id);
        Map data = new HashMap();
        data.put("money", t.getPrice());
        data.put("transferor_id", userid);
        data.put("recipient_id", 9999);
        String response = HttpRequest.get("http://localhost:10003/deal/addnew").form(data).body();
        if (Integer.parseInt(response) == 1) {
            ticketService.buyOneTicketById(ticket_id);
        } else {
            return -1;
        }
        return 1;
    }


}
