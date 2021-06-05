/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication15;

import java.util.ArrayList;

public class Admin{
	
	private int id = 0;
	private int choice = 0;
	private static boolean resultUploaded = false;
	
	
	private Result result = null;
	private Result lresult = null;

	StudentManager studentMmanager = new StudentManager();
	
	public static ArrayList<Result> resultArrayList = new ArrayList<>();
	Admin(){

	}

	
	
	public void createResult(int id, int subCode[], String subName[], int mark[],int n){
		Result result = new Result(id,subCode,subName,mark,n);
		resultArrayList.add(result);
                resultUploaded = true;
	}
	public boolean matchId(int id){
		if(resultArrayList != null){
			for(Result result : resultArrayList){
				if(result.getId() == id){
					this.result = result;
					return true;
				}
			}
		}
		result = null;
		return false;
	}
	public boolean matchLoginId(int id){
		if(resultArrayList != null){
			for(Result result : resultArrayList){
				if(result.getId() == id){
					lresult = result;
					return true;
				}
			}
		}
		lresult = null;
		return false;
	}
        
	
	public boolean resultUpload(){
		if(resultUploaded){
			return true;
		}
		return false;
	}
	
        public String setSubjectName(int a){
            if(a == 101)
                return "Bangla";
            else if(a == 102)
                return "English";
            else if(a == 103)
                return "Mathematics";
            else if(a == 104)
                return "ICT";
            else if(a == 105)
                return "Physics";
            else if(a == 106)
                return "Chemistry";
            else if(a == 107)
                return "Biology";
            else if(a == 108)
                return "Finance";
            else if(a == 109)
                return "Accounting";
            else if(a == 110)
                return "Marketting";
            else if(a == 111)
                return "Management";
            else if(a == 112)
                return "Statistics";
            else if(a == 113)
                return "Economics";
            else if(a == 114)
                return "Religion";
            else if(a == 115)
                return "Science";
            else if(a == 116)
                return "Bangladesh Studies";
            else if(a == 117)
                return "Agriculture Education";
            return "";
        }
        public String mySubjectCode(int a){
            if(lresult != null){
                return Integer.toString(lresult.getSubjectCode(a));
            }
            return "";
        }
        public String myMark(int a){
            if(lresult != null){
                return Integer.toString(lresult.getMark(a));
            }
            return "";
        }
        public String mySubjectName(int a){
            if(lresult != null){
                return lresult.getSubjectName(a);
            }
            return "";
        }
        public int mycourseNumber(){
            return lresult.getNumberOfCourse();
        }
        public String otherSubjectCode(int a){
            if(result != null){
                return Integer.toString(result.getSubjectCode(a));
            }
            return "";
        }
        public String otherMark(int a){
            if(result != null){
                return Integer.toString(result.getMark(a));
            }
            return "";
        }
        public String otherSubjectName(int a){
            if(result != null){
                return result.getSubjectName(a);
            }
            return "";
        }
        public int othercourseNumber(){
            return result.getNumberOfCourse();
        }
}
