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
public class Teacher extends Person {
    private String department;
	private int id;
	Teacher(String name, String category ,String bg,String contact, String add, String email, String pass,String dept, int id){
		super(name,category, bg,contact,add,email,pass);
		this.id = id;
		department = dept;
		
	}

	public void setid(int r){
		id = r;
	}
	public int getId(){
		return id;
	}

	public void setDepartment(String l){
		department = l;
	}
	public String getDepartment(){
		return department;
	}
}
