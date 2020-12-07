package SingleResponsibility.correct.User;

import java.time.LocalDate;

public class User extends Person {

	private String email;
	private String password;
	private LocalDate birthDate;
	private String country;
	private String phoneNumber;

	public User() {
		super();
	}

	public User(Integer id) {
		super(id);
	}

	public User(String firstName, String lastName, byte[] profileImage, String gender, String email, String password) {
		super(firstName, lastName, profileImage, gender);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}