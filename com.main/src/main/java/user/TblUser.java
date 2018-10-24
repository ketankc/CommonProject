package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TblUser {
	private Long userId;
	private String userName;
	private String hashPassword;
	private String emailId;
	private byte userType;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getUserId() {
		return userId;
	}	
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHashPassword() {
		return hashPassword;
	}
	public void setHashPassword(String hashPassword) {
		this.hashPassword = hashPassword;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public byte getUserType() {
		return userType;
	}
	public void setUserType(byte userType) {
		this.userType = userType;
	}
	
	
	
	
	
	
}
