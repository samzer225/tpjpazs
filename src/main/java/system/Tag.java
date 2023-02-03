package system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Tag {

    private Long idTag;
    private String libelle;

    private Ticket ticket;


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
