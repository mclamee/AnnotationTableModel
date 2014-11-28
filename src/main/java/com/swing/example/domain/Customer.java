package com.swing.example.domain;

import java.util.Date;

import com.swing.table.ColumnFormat;
import com.swing.table.ColumnName;



public class Customer {

	@ColumnName(i18nKey = "CustomerID")
	private int id;
	@ColumnName(i18nKey = "CustomerName", locale = "zh_CN")
	private String name;
	@ColumnName(i18nKey = "ContactNumber", locale = "en_US")
	private String contact;
	@ColumnName(i18nKey = "Email")
	private String email;
	@ColumnName(i18nKey = "RegisterDate")
	@ColumnFormat(format="yyyy/MM/dd")
	private Date date;
	
	public Customer(int id, String name, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
	}

	public Customer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
