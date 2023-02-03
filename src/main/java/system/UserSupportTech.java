package system;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;


@Entity
@Inheritance
public class UserSupportTech extends User {

    private String job;
    private Set<Ticket> tickets = new HashSet<>();


    /**
     * Constructor
     */
    public UserSupportTech(){}

    /**
     * Getter and Setter
     * @return
     */
    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @ManyToMany
    public Set<Ticket> getTickets() {
        return tickets;
    }


    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

}
