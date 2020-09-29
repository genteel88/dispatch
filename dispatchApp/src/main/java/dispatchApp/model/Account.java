package dispatchApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Account")
public @Data class Account {
	
	private static final long serialVersionUID = 2681765652204068205L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@OneToOne(mappedBy="account")
	private User user;
	
	private String email;
	private String passwordHash;
	private String status;
	private String type;
	private float balance;
	
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
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
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPasswordHash() {
//		return passwordHash;
//	}
//
//	public void setPasswordHash(String passwordHash) {
//		this.passwordHash = passwordHash;
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
//	public String getType() {
//		return type;
//	}
//
//	public void setType(String type) {
//		this.type = type;
//	}
//
//	public float getBalance() {
//		return balance;
//	}
//
//	public void setBalance(float balance) {
//		this.balance = balance;
//	}
}
