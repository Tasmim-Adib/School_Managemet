/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.util.ArrayList;
/**
 *
 * @author adib
 */
public class StudentManager {
    private String userName = "";
	private	String password = "";
	private String tuserName = "";
	private String tpassword = "";
	private int roll = 0;
	private String contact = "";
	private String email = "";
	private String address = "";
	private String bg = "";
	private String cl = "";
	private static ArrayList<Student> studentArrayList = new ArrayList<>();
        private static Student matchStudent = null;
	private static Student lstudent = null;
	//Admin admin = new Admin();
	
	StudentManager(){
            
        }

	public void createStudentAccount(String name,String cat, String bg,String contact, String add, String email, String pass,int roll){
		Student student = new Student(name,cat,bg,contact,add,email,pass,roll);
		studentArrayList.add(student);
                
	}
	
    
        public boolean isValidStudentUserid(int roll){
            
		if(studentArrayList.size() > 0){
                   
                    for(Student pupil : studentArrayList){
                        
                        if(pupil.getRoll() == roll){
                            matchStudent = pupil;
                            return true;
                        }
                    }
		}
		matchStudent = null;
		return false;
	}
        public boolean isValidStudentRoll(String user,int roll){
            
		if(studentArrayList.size() > 0){
                   
                    for(Student pupil : studentArrayList){
                        
                        if(pupil.getRoll() == roll){
                            matchStudent = pupil;
                            return true;
                        }
                    }
		}
		matchStudent = null;
		return false;
	}

	public boolean studentPasswordMatch(String pass){
		if(matchStudent != null){
			if((matchStudent.getPassword().equals(pass))){
				lstudent = matchStudent;
				return true;
			}
		}
		return false;
	}
	public String studentGetName(){
		if(matchStudent != null){
			return matchStudent.getName();
		}
		return "";
	}
	public String studentGetCategory(){
		if(matchStudent != null){
			return matchStudent.getCategory();
		}
		return "";
	}
	public String studentGetAddress(){
		if(matchStudent != null){
			return matchStudent.getAddress();
		}
		return "";
	}
	public String studentGetContactNo(){
		if(matchStudent != null){
			return matchStudent.getContactNo();
		}
		return "";
	}
	public String studentGetEmail(){
		if(matchStudent != null){
			return matchStudent.getEmail();
		}
		return "";
	}
	public String studentGetBloodGroup(){
		if(matchStudent != null){
			return matchStudent.getBloodGroup();
		}
		return "";
	}
	
	public String studentGetRoll(){
		if(matchStudent != null){
			int roll = matchStudent.getRoll();
                        return Integer.toString(roll);
		}
		return "";
	}

public String lgetName(){
		if(lstudent != null){
			return lstudent.getName();
		}
		return "";
	}
	public String lgetAddress(){
		if(lstudent != null){
			return lstudent.getAddress();
		}
		return "";
	}
	public String lgetContactNo(){
		if(lstudent != null){
			return lstudent.getContactNo();
		}
		return "";
	}
	public String lgetcategory(){
		if(lstudent != null){
			return lstudent.getCategory();
		}
		return "";
	}
	public String lgetEmail(){
		if(lstudent != null){
			return lstudent.getEmail();
		}
		return "";
	}
	public String lgetBloodGroup(){
		if(lstudent != null){
			return lstudent.getBloodGroup();
		}
		return "";
	}
	
	public String lgetRoll(){
		if(lstudent != null){
			int roll = lstudent.getRoll();
                        return Integer.toString(roll);
		}
		return "";
	}

    
}