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
public class Student extends Person {
    private int roll;
	
	Student(String name, String category, String bg,String contact, String add, String email, String pass, int roll){
		super(name,category, bg,contact,add,email,pass);
		this.roll = roll;
		
	}

	public void setRoll(int r){
		roll = r;
	}
	public int getRoll(){
		return roll;
	}
}
