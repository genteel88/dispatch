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

import lombok.Data;

@Entity
@Table(name="\"Option\"")
public @Data class Option {

	private static final long serialVersionUID = 1234581123401234205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="option")
	private User user;
	
	private String startAddress;
	
	private String endAddress;
	
	@OneToOne(mappedBy="option")
	private Order order;
	
	@OneToOne(mappedBy="option")
	private Carrier carrier;
	
	// carrierId && carrierType already store in Carrier object
//	private int carrierId;
//	private String carrierType;
	
	private String departureTime;
	private String deliveryTime;	
	private String endTime;	
	private int weight;	
	private float fee;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
//	public int getWeight() {
//		return weight;
//	}
//
//	public String getStartAddress() {
//		return startAddress;
//	}
//
//	public void setStartAddress(String startAddress) {
//		this.startAddress = startAddress;
//	}
//
//	public String getEndAddress() {
//		return endAddress;
//	}
//
//	public void setEndAddress(String endAddress) {
//		this.endAddress = endAddress;
//	}
//
//	public Carrier getCarrier() {
//		return carrier;
//	}
//
//	public void setCarrier(Carrier carrier) {
//		this.carrier = carrier;
//	}
//
//	public String getDepartureTime() {
//		return departureTime;
//	}
//
//	public void setDepartureTime(String departureTime) {
//		this.departureTime = departureTime;
//	}
//
//	public String getDeliveryTime() {
//		return deliveryTime;
//	}
//
//	public void setDeliveryTime(String deliveryTime) {
//		this.deliveryTime = deliveryTime;
//	}
//
//	public String getEndTime() {
//		return endTime;
//	}
//
//	public void setEndTime(String endTime) {
//		this.endTime = endTime;
//	}
//
//	public void setWeight(int weight) {
//		this.weight = weight;
//	}
//
//	public float getFee() {
//		return fee;
//	}
//
//	public void setFee(float fee) {
//		this.fee = fee;
//	}
}
