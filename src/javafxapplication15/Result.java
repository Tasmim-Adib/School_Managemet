
package javafxapplication15;

public class Result {
     private int id = 0;
	private String level = "";
	private int subjectCode[] = new int[20];
	private String subjectName[] = new String[20];
	private int mark[] = new int[20];
	private static int numberOfCourse = 0;
	Result(int id, int code[], String name[], int mark[],int n){
		this.id = id;
		
		for(int i = 0;i<code.length;i++){
                    subjectCode[i] = code[i];
                    subjectName[i] = name[i];
                    this.mark[i] = mark[i];
		}
		numberOfCourse = n;
	}
	public void setSubjectCode(int s[]){
		for(int i = 0;i<s.length;i++){
                    subjectCode[i] = s[i];
		}
		
	}
	public int getSubjectCode(int a){
		return subjectCode[a];
	}
	public void setMark(int s[]){
		for(int i = 0;i<s.length;i++){
			mark[i] = s[i];
		}
	}
	public int getMark(int a){
		return mark[a];
	}
	public void setId(int s){
		id = s;
	}
	public int getId(){
		return id;
	}
	public void setSubjectName(String s[]){
		for(int i = 0;i<s.length;i++){
                    subjectName[i] = s[i];
		}
		
	}
	public String getSubjectName(int a){
		return subjectName[a];
	}
	
	public void setNumberOfCourse(int s){
		numberOfCourse = s;
	}
	public int getNumberOfCourse(){
		return numberOfCourse;
	}
}
