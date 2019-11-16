package lee.mj.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	int id;
	String title;
	String content;
	User writer;
	java.util.Date wdate;
	java.util.Date udate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getWriter() {
		return writer;
	}
	public void setWriter(User writer) {
		this.writer = writer;
	}
	public java.util.Date getWdate() {
		return wdate;
	}
	public void setWdate(java.util.Date wdate) {
		this.wdate = wdate;
	}
	public java.util.Date getUdate() {
		return udate;
	}
	public void setUdate(java.util.Date udate) {
		this.udate = udate;
	}
	public List<Board> getList(){
		return new ArrayList<Board>();
	}
	public Board getBoard() {
		return new Board();
	}
	public boolean insert() {
		return false;
	}
	public boolean edit() {
		return false;
	}

}
