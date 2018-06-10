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

    //增
    //改
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    // 删
    public int deleteById(int id) {
        return ticketRepository.deleteById(id);
    }

    // 查
    //更新全部
    public List<Ticket> findAll() {
        return ticketRepository.findAll();
    }
    //查可用的
    public List<Ticket> findAllAvaliable() {
        return ticketRepository.findAllByAmountGreaterThan(0);
    }

    public Ticket findByTicketID(int id) {
        return ticketRepository.findById(id);
    }

    //根据出发地点与目的地查票
    public List<Ticket> findAllByStartAndEnd(String start, String end) {
        return ticketRepository.findAllByStartAndEnd(start, end);
    }
    public List<Ticket> findAllByStart(String start) {
        return ticketRepository.findAllByStart(start);
    }
    public List<Ticket> findAllByEnd(String end) {
        return ticketRepository.findAllByEnd(end);
    }

}
