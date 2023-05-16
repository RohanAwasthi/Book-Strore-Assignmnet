package com.rohan.Book_Store;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

public class Book {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Id
	private int id;
	
	private String book_name;
	
	//@ManyToOne
	//private User user;
	
	@ManyToMany
	private List<User> user1 = new ArrayList<User>();

//	public User getUser() {
	//	return user;
//	}

	public List<User> getUser1() {
		return user1;
	}

	public void setUser1(List<User> user1) {
		this.user1 = user1;
	}

//	public void setUser(User user) {
	//	this.user = user;
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	
}
