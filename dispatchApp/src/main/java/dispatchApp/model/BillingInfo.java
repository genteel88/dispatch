package dispatchApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BillingInfo")
public class BillingInfo {

	private static final long serialVersionUID = 1234587852204068205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="billingInfo")
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Address billingAddress;
	
	private int cardNum;
	
	private String dueDate;
	
	private int cvs;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getCvs() {
		return cvs;
	}

	public void setCvs(int cvs) {
		this.cvs = cvs;
	}
	
}
