package system;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Set;


@Entity
public class UserSupportTech extends User {

    private String job;

    /**
     * Constructor
     */
    public UserSupportTech(){}

    public UserSupportTech(String name, String job){
        this.job = job;
        this.setName(name);
    }


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


    @Override
<<<<<<< HEAD
    @ManyToMany(mappedBy = "userST")
=======
    @ManyToMany
>>>>>>> da1af238e61b06d944826af42addeb258a604013
    public Set<Ticket> getListTickets() {
        return super.getListTickets();
    }

    @Override
    public void setListTickets(Set<Ticket> listTickets) {
        super.setListTickets(listTickets);
    }

}
