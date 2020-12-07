package SingleResponsibility.correct.User;

public class Person {
	private Integer id;
	private String firstName;
	private String lastName;
	private byte[] profileImage;
	private String gender;

	public Person(String firstName, String lastName, byte[] profileImage, String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileImage = profileImage;
	}

	public Person(Integer id, String firstName, String lastName, byte[] profileImage, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileImage = profileImage;
		this.gender = gender;
	}

	public Person() {
		super();
	}

	public Person(Integer id, String firstName, String lastName, byte[] profileImage) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.profileImage = profileImage;
	}

	public Person(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte[] getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(byte[] profileImage) {
		this.profileImage = profileImage;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
