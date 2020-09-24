package dispatchApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {

	private static final long serialVersionUID = 1234765652204068205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="billingAddress")
	private BillingInfo billingInfo;

	@OneToOne(mappedBy="startAddress")
	private Option optionStart;
	
	@OneToOne(mappedBy="endAddress")
	private Option optionEnd;

	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String country;
	
	public Option getOptionStart() {
		return optionStart;
	}

	public void setOptionStart(Option optionStart) {
		this.optionStart = optionStart;
	}

	public Option getOptionEnd() {
		return optionEnd;
	}

	public void setOptionEnd(Option optionEnd) {
		this.optionEnd = optionEnd;
	}
	
	public BillingInfo getBillingInfo() {
		return billingInfo;
	}

	public void setBillingInfo(BillingInfo billingInfo) {
		this.billingInfo = billingInfo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}
