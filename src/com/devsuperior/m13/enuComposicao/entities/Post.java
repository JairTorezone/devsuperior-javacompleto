package com.devsuperior.m13.enuComposicao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	private Date date;
	private String title;
	private String content;
	private int likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	public Post() {}

	public Post(Date date, String title, String content, int likes) {
		super();
		this.date = date;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}


	public void addComments(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComments(Comment comment) {
		comments.remove(comment);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append("  Likes - " + sdf.format(date) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for(Comment c: comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
	}
	
}
