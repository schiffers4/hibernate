package com.maul.hibernate_library.entitys;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "idBook")
	private Integer id;
	private String title;
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinColumn(name="id_category",nullable = true)
	private Category idCategory;
	private String author;
	@Column(name="date_release")
	private Date dateRelease;
	private String shelf;
	private String status;
	
	public Book() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Category getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(Category idCategory) {
		this.idCategory = idCategory;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getDateRelease() {
		return dateRelease;
	}
	public void setDateRelease(Date dateRelease) {
		this.dateRelease = dateRelease;
	}
	public String getShelf() {
		return shelf;
	}
	public void setShelf(String shelf) {
		this.shelf = shelf;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
