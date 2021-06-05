/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

/**
 *
 * @author adib
 */
public class Person {
    private String name;
	private String bloodGroup;
	private String contactNo;
	private String address;
	private String email;
	private String password;
	private String category;


	Person(String name, String cat, String bg,String contact, String add, String email, String pass){
		this.name = name;
		category = cat;
		bloodGroup = bg;
		contactNo = contact;
		address = add;
		this.email = email;
		password = pass;
	}
	public void setName(String nameInput){
		name = nameInput;
	}
	public String getName(){
		return name;
	}

	public void setBloodGroup(String bginput){
		bloodGroup = bginput;
	}
	public String getBloodGroup(){
		return bloodGroup;
	}
	public void setContactNo(String c){
		contactNo = c;
	}

	public String getContactNo(){
		return contactNo;
	}
	public void setAddress(String add){
		address = add;
	}
	public String getAddress(){
		return address;
	}
	public void setEmail(String mail){
		email = mail;
	}
	public String getEmail(){
		return email;
	}
	public void setPassword(String pass){
		password = pass;
	}
	public String getPassword(){
		return password;
	}
	public void setCategory(String c){
		category = c;
	}
	public String getCategory(){
		return category;
	}
}