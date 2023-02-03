package system;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tag {

    private Long idTag;
    private String libelle;

    private Set<Ticket> tickets = new HashSet<>();


    public Tag(){}

    public Tag(String libelle){
        this.libelle =libelle;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return idTag;
    }
    public void setId(Long id) {
        this.idTag = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @OneToMany(mappedBy = "tag", cascade = CascadeType.PERSIST)
    public Set<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Ticket> tickets) {
        this.tickets = tickets;
    }

    /*
    @ManyToOne
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

     */
}
