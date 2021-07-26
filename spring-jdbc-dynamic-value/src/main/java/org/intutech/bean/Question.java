package org.intutech.bean;

// bean/model/domain/dao/dto
public class Question {
	private int id;
	private String title;
	private String quesdesc;
	private String postedon;

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

	public String getQuesdesc() {
		return quesdesc;
	}

	public void setQuesdesc(String quesdesc) {
		this.quesdesc = quesdesc;
	}

	public String getPostedon() {
		return postedon;
	}

	public void setPostedon(String postedon) {
		this.postedon = postedon;
	}
}
