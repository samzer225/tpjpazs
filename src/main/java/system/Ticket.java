package system;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Ticket {

    @Id
    @GeneratedValue
    private Long idTicket;
    private String libelle;
    private Date dateCreationTicket;
    private String statut;

    private Tag tag;
    private User user;
    private UserSupportTech userST;

    /**
     * Constructor
     */
    public Ticket() {}

    public Ticket(String libelle, String statut) {
        this.libelle = libelle;
        this.statut = statut;
    }


    /**
     *  Getter and Setter
     */
    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateCreationTicket() {
        return dateCreationTicket;
    }

    public void setDateCreationTicket(Date dateCreationTicket) {
        this.dateCreationTicket = dateCreationTicket;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @ManyToOne
    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /*
    @ManyToMany
    public UserSupportTech getUser() {
        return userST;
    }

    public void setUser(UserSupportTech userST) {
        this.userST = userST;
    }
     */
}
