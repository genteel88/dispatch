package dispatchApp.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomerOption")
public class Option {

	private static final long serialVersionUID = 1234581123401234205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="option")
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="startAddressId", referencedColumnName="id")
	private Address startAddress;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
//	@JoinColumn(name="endAddressId", referencedColumnName="id")
	private Address endAddress;
	
	@OneToOne(mappedBy="option")
	private Order order;
	
	private Timestamp departureTime;
	
	private int optionWeight;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Address getStartAddress() {
		return startAddress;
	}

	public void setStartAddress(Address startAddress) {
		this.startAddress = startAddress;
	}

	public Address getEndAddress() {
		return endAddress;
	}

	public void setEndAddress(Address endAddress) {
		this.endAddress = endAddress;
	}

	public Timestamp getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Timestamp departureTime) {
		this.departureTime = departureTime;
	}

	public int getOptionWeight() {
		return optionWeight;
	}

	public void setOptionWeight(int optionWeight) {
		this.optionWeight = optionWeight;
	}
}
