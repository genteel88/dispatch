package dispatchApp.model;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="\"Order\"")
public @Data class Order {

	private static final long serialVersionUID = 1234581256781234205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JsonIgnore
	private User user;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Option option;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Carrier carrier;
	
	private String deliveryTime;
	private float fee;
	private String startAddress;
	private String endAddress;
	private String status;

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
//	public Option getOption() {
//		return option;
//	}
//
//	public void setOption(Option option) {
//		this.option = option;
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
//	public String getDeliveryTime() {
//		return deliveryTime;
//	}
//
//	public void setDeliveryTime(String deliveryTime) {
//		this.deliveryTime = deliveryTime;
//	}
//
//	public float getFee() {
//		return fee;
//	}
//
//	public void setFee(float fee) {
//		this.fee = fee;
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
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}
}
