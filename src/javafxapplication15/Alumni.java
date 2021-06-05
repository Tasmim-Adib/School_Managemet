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
public class Alumni extends Person {
    private String session;
	private String workingPlace;
	private int id;
	
	Alumni(String name,String category ,String bg,String contact, String add, String email, String pass,int id,String session, String work){
		super(name, category,bg,contact,add,email,pass);
                this.id = id;
		this.session = session;
		workingPlace = work;
		
		
	}
	public void setSession(String s){
		session = s;
	}
	public String getSession(){
		return session;
	}
	public void setWorkingPlace(String a){
		workingPlace = a;
	}
	public String getWorkingPlace(){
		return workingPlace;
	}
	public void setId(int a){
		id = a;
	}
	public int getId(){
		return id;
	}
}