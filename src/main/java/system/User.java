package system;

//import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance
public class User {
	private Long idUser;
	protected String name;

	protected Set<Ticket> listTickets = new HashSet<>();

	/**
	 * Constructor
	 */
	public User(){
		super();
	}

	public User(String name){
		this.name = name;
	}

	/**
	 * Getter and Setter
	 */
	@Id
	@GeneratedValue
	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	/**
	 * getTickets
	 * @return
	 */
	@OneToMany(mappedBy = "user", cascade = CascadeType.PERSIST)
	public Set<Ticket> getListTickets() {
		return listTickets;
	}

	public void setListTickets(Set<Ticket> listTickets) {
		this.listTickets = listTickets;
	}
	/**
	 * CreateTicket
	 */
	public void CreateTicket(){}


}
