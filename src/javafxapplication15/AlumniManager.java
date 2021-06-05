/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.util.ArrayList;

public class AlumniManager{
	private String userName = "";
	private String bg = "";
	private String contact = "";
	private String address = "";
	private String email="";
	private String password ="";
	private int id= 0;
	private String department ="";
	private String session = "";
	private String workingPlace = "";

	private static ArrayList<Alumni> alumniArrayList = new ArrayList<>();
	private Person person = null;
	private static Alumni alumni= null;
	private static Alumni lalumni = null;
	AlumniManager(){

	}
	public void createAccount(String name, String cat,String bg,String contact, String add, String email, String pass,int id,String session,String work){
		Alumni alumni = new Alumni(name,cat,bg,contact,add,email,pass,id,session,work);
		alumniArrayList.add(alumni);

	}
	public boolean isValidUserId(int id){
		if(alumniArrayList != null){
			for(Alumni alumni : alumniArrayList){
				if(alumni.getId() == id){
					this.alumni = alumni;
					return true;
				}
			}
			
		}
		alumni = null;
		return false;
	}
	public boolean isValidRoll(int roll){
            
		if(alumniArrayList.size() > 0){
                   
                    for(Alumni alumni : alumniArrayList){
                        
                        if(alumni.getId() == roll){
                            this.alumni = alumni;
                            return true;
                        }
                    }
		}
		alumni = null;
		return false;
	}

	public boolean passwordMatch(String pass){
		if(alumni != null){
			if((alumni.getPassword().equals(pass))){
				lalumni = alumni;
				return true;
			}
		}
		return false;
	}
	public String getName(){
		if(alumni != null){
			return alumni.getName();
		}
		return "";
	}
	public String getAddress(){
		if(alumni != null){
			return alumni.getAddress();
		}
		return "";
	}
	public String getContactNo(){
		if(alumni != null){
			return alumni.getContactNo();
		}
		return "";
	}
	public String getEmail(){
		if(alumni != null){
			return alumni.getEmail();
		}
		return "";
	}
	public String getCategory(){
		if(alumni != null){
			return alumni.getCategory();
		}
		return "";
	}
	public String getSession(){
		if(alumni != null){
			return alumni.getSession();
		}
		return "";
	}
	public String getWorkingPlace(){
		if(alumni != null){
			return alumni.getWorkingPlace();
		}
		return "";
	}
	public String getBloodGroup(){
		if(alumni != null){
			return alumni.getBloodGroup();
		}
		return "";
	}
	
	public String getId(){
		if(alumni != null){
			int id = alumni.getId();
                        return Integer.toString(id);
		}
		return "";
	}

public String lgetName(){
		if(lalumni != null){
			return lalumni.getName();
		}
		return "";
	}
	public String lgetAddress(){
		if(lalumni != null){
			return lalumni.getAddress();
		}
		return "";
	}
	public String lgetContactNo(){
		if(lalumni != null){
			return lalumni.getContactNo();
		}
		return "";
	}
	public String lgetEmail(){
		if(lalumni != null){
			return lalumni.getEmail();
		}
		return "";
	}
	public String lgetCategory(){
		if(lalumni != null){
			return lalumni.getCategory();
		}
		return "";
	}
	public String lgetBloodGroup(){
		if(lalumni != null){
			return lalumni.getBloodGroup();
		}
		return "";
	}
	public String lgetSession(){
		if(lalumni != null){
			return lalumni.getSession();
		}
		return "";
	}
	public String lgetWorkingPlace(){
		if(lalumni != null){
			return lalumni.getWorkingPlace();
		}
		return "";
	}
	
	public String lgetId(){
		if(lalumni != null){
			int id = lalumni.getId();
                        return Integer.toString(id);
		}
		return "";
	}

}