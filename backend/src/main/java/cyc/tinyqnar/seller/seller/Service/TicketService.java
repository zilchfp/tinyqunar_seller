package cyc.tinyqnar.seller.seller.Service;

import cyc.tinyqnar.seller.seller.Domain.Ticket;
import cyc.tinyqnar.seller.seller.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    //根据出发地点与目的地查票
    public List<Ticket> findAllByStartAndEnd(String start, String end) {
        return ticketRepository.findAllByStartAndEnd(start, end);
    }

    public Ticket findByTicketID(int id) {
        return ticketRepository.findById(id);
    }

    public List<Ticket> findRestTickets() {
        return ticketRepository.findAllByAmountGreaterThan(0);
    }

    public int deleteById(int id) {
        return ticketRepository.deleteById(id);
    }

    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }


}
