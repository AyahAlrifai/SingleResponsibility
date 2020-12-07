package SingleResponsibility.correct.Post;

import java.util.ArrayList;

public class Poll extends Post {
	private ArrayList<Choice> choices;
	private PollPrivacy privacy;
	private ArrayList<Comment> comments;
	private ChoicesType type;
	public ArrayList<Choice> getChoices() {
		return choices;
	}
	public void setChoices(ArrayList<Choice> choices) {
		this.choices = choices;
	}
	public PollPrivacy getPrivacy() {
		return privacy;
	}
	public void setPrivacy(PollPrivacy privacy) {
		this.privacy = privacy;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	public ChoicesType getType() {
		return type;
	}
	public void setType(ChoicesType type) {
		this.type = type;
	}
	
}