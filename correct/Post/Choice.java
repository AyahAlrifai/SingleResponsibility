package SingleResponsibility.correct.Post;


import java.util.HashMap;

import SingleResponsibility.correct.User.Person;

public class Choice {
	private Integer id;
	private HashMap<Integer, Person> voter;
	private String textValue;
	private byte[] mediaValue;
	private Integer voteCount;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public HashMap<Integer, Person> getVoter() {
		return voter;
	}

	public void setVoter(HashMap<Integer, Person> voter) {
		this.voter = voter;
	}

	public String getTextValue() {
		return textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public byte[] getMediaValue() {
		return mediaValue;
	}

	public void setMediaValue(byte[] mediaValue) {
		this.mediaValue = mediaValue;
	}

	public Integer getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

}