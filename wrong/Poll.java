/*
 * This is a bad example for the Single Responsibility principle
 * if you want to add more types of privacy
 * or you want to make choices have images, voice notes, or videos
 * or comment have an image with text .....
 * or comment has a list of likes
 * or comment has a list of replies
 * you must modify all code 
 * this code very bad for any modified
 * let's go to improve it 
 */

package SingleResponsibility.wrong;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Poll {
	private String userName;
	private Integer userId;
	private String textValue;
	private LocalDateTime date;
	//Radio or checkBox
	private String type;
	//public or private
	private String privacy;
	// must be String 
	private ArrayList<String> choices;
	//user_id,choice_id
	private HashMap<Integer, Integer> votes;
	// userId,userName
	private HashMap<Integer, String> likes;
	// user_id,comment value
	private HashMap<Integer, String> comments;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public String getTextValue() {
		return textValue;
	}
	
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getPrivacy() {
		return privacy;
	}
	
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	
	public ArrayList<String> getChoices() {
		return choices;
	}
	
	public void setChoices(ArrayList<String> choices) {
		this.choices = choices;
	}
	
	public HashMap<Integer, Integer> getVotes() {
		return votes;
	}
	
	public void setVotes(HashMap<Integer, Integer> votes) {
		this.votes = votes;
	}
	
	public HashMap<Integer, String> getLikes() {
		return likes;
	}
	
	public void setLikes(HashMap<Integer, String> likes) {
		this.likes = likes;
	}
	
	public HashMap<Integer, String> getComments() {
		return comments;
	}
	
	public void setComments(HashMap<Integer, String> comments) {
		this.comments = comments;
	}
	
}
