package cyc.tinyqnar.seller.seller.Repository;

import cyc.tinyqnar.seller.seller.Domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TicketRepository extends JpaRepository<Ticket, Long> {

    List<Ticket> findAllByStartAndEnd(String start, String end);

    Ticket findById(int id);


//    @Query("from User u where u.name=:name")
//    User findUser(@Param("name") String name);

}