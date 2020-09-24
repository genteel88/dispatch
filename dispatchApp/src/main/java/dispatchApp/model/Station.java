package dispatchApp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Station")
public class Station {

	private static final long serialVersionUID = 1234587852201234205L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToMany(mappedBy="station", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Carrier> carrier;
	
	private String address;
	
	private int remainDroneNum;
	
	private int remainRobotNum;

	public List<Carrier> getCarrier() {
		return carrier;
	}

	public void setCarrier(List<Carrier> carrier) {
		this.carrier = carrier;
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

	public int getRemainDroneNum() {
		return remainDroneNum;
	}

	public void setRemainDroneNum(int remainDroneNum) {
		this.remainDroneNum = remainDroneNum;
	}

	public int getRemainRobotNum() {
		return remainRobotNum;
	}

	public void setRemainRobotNum(int remainRobotNum) {
		this.remainRobotNum = remainRobotNum;
	}
	
}
