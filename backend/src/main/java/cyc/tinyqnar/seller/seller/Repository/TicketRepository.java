package cyc.tinyqnar.seller.seller.Repository;

import cyc.tinyqnar.seller.seller.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Long> {


    List<Ticket> findAllByStartAndEnd(String start, String end);
    List<Ticket> findAllByStart(String start);
    List<Ticket> findAllByEnd(String end);

    Ticket findById(int id);

    List<Ticket> findAllByAmountGreaterThan(int lowerBound);





    @Transactional
    int deleteById(int id);



}