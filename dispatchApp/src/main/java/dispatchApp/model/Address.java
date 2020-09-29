package dispatchApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Address")
public @Data class Address {

	private static final long serialVersionUID = 1234765652204068205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@OneToOne(mappedBy="address")
	private User user;
	
	private String address;
	private String city;
	private String state;
	private int zipcode;
	private String country;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getAddress() {
//		return address;
//	}
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}
//
//	public String getState() {
//		return state;
//	}
//
//	public void setState(String state) {
//		this.state = state;
//	}
//
//	public int getZipcode() {
//		return zipcode;
//	}
//
//	public void setZipcode(int zipcode) {
//		this.zipcode = zipcode;
//	}
//
//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}
}
