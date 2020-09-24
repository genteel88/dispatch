package dispatchApp.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Carrier")
public class Carrier implements Serializable {

	private static final long serialVersionUID = 2681531852204068205L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JsonIgnore
	private Station station;
	
	@OneToOne(mappedBy="carrier")
	private Order order;
	
	private String status;
	private int price;
	private int maxWeight;
	private int maxLength;
	private int speed;
	private float lon;
	private float lat;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getMaxWeight() {
		return maxWeight;
	}
	
	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	public int getMaxLength() {
		return maxLength;
	}
	
	public void setMaxLength(int maxLength) {
		this.maxLength = maxLength;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public float getLon() {
		return lon;
	}
	
	public void setLon(float lon) {
		this.lon = lon;
	}
	
	public float getLat() {
		return lat;
	}
	
	public void setLat(float lat) {
		this.lat = lat;
	}
	
}
