package SingleResponsibility.correct.Post;

import java.time.LocalDateTime;
import java.util.HashMap;

import SingleResponsibility.correct.User.Person;

public class Post {
	private Integer id;
	private String textValue;
	private Person user;
	private LocalDateTime postDate;
	private HashMap<Integer, Like> likes;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTextValue() {
		return textValue;
	}
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
	public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	public LocalDateTime getPostDate() {
		return postDate;
	}
	public void setPostDate(LocalDateTime postDate) {
		this.postDate = postDate;
	}
	public HashMap<Integer, Like> getLikes() {
		return likes;
	}
	public void setLikes(HashMap<Integer, Like> likes) {
		this.likes = likes;
	}

	
}
