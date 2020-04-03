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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transactions {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_book",nullable = true)
	private Book idBook;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.PERSIST)
	@JoinColumn(name = "id_member",nullable = true)
	private Member idMember;
	@Column(name="date_borrow")
	private Date dateBorrow;
	@Column(name="date_return")
	private Date dateReturn;
	private Integer rent;
	private Integer penalty;
	
	public Transactions() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Book getIdBook() {
		return idBook;
	}
	public void setIdBook(Book idBook) {
		this.idBook = idBook;
	}
	public Member getIdMember() {
		return idMember;
	}
	public void setIdMember(Member idMember) {
		this.idMember = idMember;
	}
	public Date getDateBorrow() {
		return dateBorrow;
	}
	public void setDateBorrow(Date dateBorrow) {
		this.dateBorrow = dateBorrow;
	}
	public Date getDateReturn() {
		return dateReturn;
	}
	public void setDateReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}
	public Integer getRent() {
		return rent;
	}
	public void setRent(Integer rent) {
		this.rent = rent;
	}
	public Integer getPenalty() {
		return penalty;
	}
	public void setPenalty(Integer penalty) {
		this.penalty = penalty;
	}
	
	
}
