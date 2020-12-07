package SingleResponsibility.correct.Post;

import java.util.ArrayList;

public class Comment extends Post {
	private ArrayList<Reply> replys;
	private byte[] mediaValue;

	public ArrayList<Reply> getReplys() {
		return replys;
	}

	public void setReplys(ArrayList<Reply> replys) {
		this.replys = replys;
	}

	public byte[] getMediaValue() {
		return mediaValue;
	}

	public void setMediaValue(byte[] mediaValue) {
		this.mediaValue = mediaValue;
	}

}