package com.lse.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name = "LSE_LIBRARY_BOOKS")
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "ISBN_NO")
	private String isbnNo;
	@Column(name = "STACK_NO")
	private String stackNo;
	@Column(name = "SHELF_NO")
	private String shelfNo;
	@Column(name = "LOCATION_NO")
	private String locationNo;
	@Column(name = "SUBJECT")
	private String subject;
	@Column(name = "AUTHOR")
	private String author;
	@Column(name = "TITLE")
	private String title;
	
	public Books(long id, String isbnNo, String stackNo, String shelfNo, String locationNo, String subject,
			String author, String title) {
		super();
		this.id = id;
		this.isbnNo = isbnNo;
		this.stackNo = stackNo;
		this.shelfNo = shelfNo;
		this.locationNo = locationNo;
		this.subject = subject;
		this.author = author;
		this.title = title;
	}
	public Books() {
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getStackNo() {
		return stackNo;
	}
	public void setStackNo(String stackNo) {
		this.stackNo = stackNo;
	}
	public String getShelfNo() {
		return shelfNo;
	}
	public void setShelfNo(String shelfNo) {
		this.shelfNo = shelfNo;
	}
	public String getLocationNo() {
		return locationNo;
	}
	public void setLocationNo(String locationNo) {
		this.locationNo = locationNo;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
