package com.sba.todo.vo;

import java.util.Date;

public class Todo {
	

	private Long id;
	
	private String content;
	
	private String isCompleted;
	
	private Date regDate;
	
	private Date updtDate;
	
	public Todo() {
		// 기본생성자
	}
	
	public Todo(String content) {
		this.content = content;
		this.regDate = new Date();
		this.updtDate = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(String isCompleted) {
		this.isCompleted = isCompleted;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdpDate() {
		return updtDate;
	}

	public void setUpdpDate(Date updpDate) {
		this.updtDate = updpDate;
	}
}
