/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;


import java.util.ArrayList;

public class TeacherManager{
	private String userName = "";
	private String bg = "";
	private String contact = "";
	private String address = "";
	private String email="";
	private String password ="";
	private int id= 0;
	private String dept ="";

	private static ArrayList<Teacher> teacherArrayList = new ArrayList<>();
	
	private static Teacher teacher = null;
	private static Teacher lteacher = null;
	
	TeacherManager(){

	}
	public void createAccount(String name, String cat,String bg,String contact, String add, String email, String pass, String dept,int id){
		Teacher teacher = new Teacher(name,cat,bg,contact,add,email,pass,dept,id);
		teacherArrayList.add(teacher);

	}
	public boolean isValidUserId(int id){
		if(teacherArrayList != null){
			for(Teacher teacher : teacherArrayList){
				if(teacher.getId() == id){
					this.teacher = teacher;
					return true;
				}
			}
			
		}
		teacher = null;
		return false;
	}
	public boolean isValidRoll(int roll){
            
		if(teacherArrayList.size() > 0){
                   
                    for(Teacher teacher : teacherArrayList){
                        
                        if(teacher.getId() == roll){
                            this.teacher = teacher;
                            return true;
                        }
                    }
		}
		teacher = null;
		return false;
	}

	public boolean passwordMatch(String pass){
		if(teacher != null){
			if((teacher.getPassword().equals(pass))){
				lteacher = teacher;
				return true;
			}
		}
		return false;
	}
	public String getName(){
		if(teacher != null){
			return teacher.getName();
		}
		return "";
	}
	public String getAddress(){
		if(teacher != null){
			return teacher.getAddress();
		}
		return "";
	}
	public String getContactNo(){
		if(teacher != null){
			return teacher.getContactNo();
		}
		return "";
	}
	public String getEmail(){
		if(teacher != null){
			return teacher.getEmail();
		}
		return "";
	}
	public String getCategory(){
		if(teacher != null){
			return teacher.getCategory();
		}
		return "";
	}
	public String getBloodGroup(){
		if(teacher != null){
			return teacher.getBloodGroup();
		}
		return "";
	}
	public String getDepartment(){
		if(teacher != null){
			return teacher.getDepartment();
		}
		return "";
	}
	public String getId(){
		if(teacher != null){
			int r =  teacher.getId();
                        return Integer.toString(r);
		}
		return "";
	}

public String lgetName(){
		if(lteacher != null){
			return lteacher.getName();
		}
		return "";
	}
	public String lgetAddress(){
		if(lteacher != null){
			return lteacher.getAddress();
		}
		return "";
	}
	public String lgetContactNo(){
		if(lteacher != null){
			return lteacher.getContactNo();
		}
		return "";
	}
	public String lgetEmail(){
		if(lteacher != null){
			return lteacher.getEmail();
		}
		return "";
	}
	public String lgetCategory(){
		if(lteacher != null){
			return lteacher.getCategory();
		}
		return "";
	}
	public String lgetBloodGroup(){
		if(lteacher != null){
			return lteacher.getBloodGroup();
		}
		return "";
	}
	public String lgetDepartment(){
		if(lteacher != null){
			return lteacher.getDepartment();
		}
		return "";
	}
	public String lgetId(){
		if(lteacher != null){
			int r = lteacher.getId();
                        return Integer.toString(r);
		}
		return "";
	}

	
	
}
