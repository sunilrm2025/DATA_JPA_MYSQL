package sunil.code.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master")
public class UserSunilEntity {
	
	@Id
	@Column(name="User_id")
	private Integer UserId;
	
	@Column(name="User_name")
	private String UserNm;
	
	@Column(name="user_ema1il")
	private String userEma1il;
	
	@Column(name="User_gender")
	private String gender ;
	
	@Column(name="User_city")
	private String city;
	
	@Column(name="User_age")
	private Integer age;
	
	
	
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserNm() {
		return UserNm;
	}
	public void setUserNm(String userNm) {
		UserNm = userNm;
	}
	public String getUserEma1il() {
		return userEma1il;
	}
	public void setUserEma1il(String userEma1il) {
		this.userEma1il = userEma1il;
	}
	public String isGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserNm=" + UserNm + ", userEma1il=" + userEma1il + ", gender=" + gender
				+ ", city=" + city + ", age=" + age + "]";
	}
}
