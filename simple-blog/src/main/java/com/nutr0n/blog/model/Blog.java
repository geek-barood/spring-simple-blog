package com.nutr0n.blog.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="blog")
public class Blog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String title;
	private Date entryDate;
	private Integer userId;
	private String content;
	public  Blog() {
		
	}
	
	public Blog(String title, String content, Integer userId, Date entryDate) {
		this.title = title;
		this.content = content;
		this.userId = userId;
		this.entryDate = entryDate;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="BLOG_ID", unique=true, nullable=false)
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name="BLOG_TITLE", nullable=false)
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Column(name="ENTRY_DATE", nullable=false)
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	
	@Column(name="USER_ID", nullable=false)
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Column(name="BLOG_CONTENT", nullable=true)
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		String res = "\nBLOG["
				+ "id=" + this.id
				+ ", userId=" + this.userId
				+ ", title=" + this.title
				+ ", content=\n" + this.content
				+ ",\nentryDate=" + this.entryDate.toString()
				+ "]\n";
		return res;
		
	}
}
