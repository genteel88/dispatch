package dispatchApp.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="Carrier")
public @Data class Carrier implements Serializable {

	private static final long serialVersionUID = 2681531852204068205L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
		
	@OneToOne(mappedBy="carrier")
	private Order order;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private Option option;
	
	private String status;
	private int speed;
	private int stationId;
	private String carrierType;
	
//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
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
//	public String getStatus() {
//		return status;
//	}
//	
//	public void setStatus(String status) {
//		this.status = status;
//	}	
//	
//	public int getSpeed() {
//		return speed;
//	}
//	
//	public void setSpeed(int speed) {
//		this.speed = speed;
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
//	public int getStationId() {
//		return stationId;
//	}
//
//	public void setStationId(int stationId) {
//		this.stationId = stationId;
//	}
//
//	public String getCarrierType() {
//		return carrierType;
//	}
//
//	public void setCarrierType(String carrierType) {
//		this.carrierType = carrierType;
//	}
}
