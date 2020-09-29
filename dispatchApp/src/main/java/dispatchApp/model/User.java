package dispatchApp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="User")
public @Data class User implements Serializable {

	private static final long serialVersionUID = 2681545652204068205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String firstName;
	private String lastName;
	private String billingAddress;
	private double balance;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Option option;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Address address;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Account account;
	
	@OneToMany(mappedBy="user")
	private List<Order> order;

//	public List<Order> getOrder() {
//		return order;
//	}
//
//	public void setOrder(List<Order> order) {
//		this.order = order;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public Option getOption() {
//		return option;
//	}
//
//	public void setOption(Option option) {
//		this.option = option;
//	}
//
//	public Account getAccount() {
//		return account;
//	}
//
//	public void setAccount(Account account) {
//		this.account = account;
//	}
}
