package exams;

public class StudentResults {

	private String Full_Name;
	private String Exam_Name;
	private String Exam_Score;
	private String Exam_Grade;

	StudentResults(){
		Full_Name = " No name Given";
		Exam_Name = "Unknown";
		Exam_Score = "No Score";
		Exam_Grade = "Unknown";

	}

	void writeFirstname(){
		System.out.println("Write your firstname");
	}
	void writeFamilyname(){
		System.out.println("Write your familyname");
	}
	void writeCode(){
		System.out.println("Write your exam code");
	}

	String fullName(String aName){
		Full_Name = aName;
		return Full_Name;
	}


	String examName(String examCode){

		if(examCode.equals("VP")){
			Exam_Name = "Videregående Programmering";
		}
		else if(examCode.equals("DB")){
			Exam_Name = "Indledende Databaser";
		}
		else if(examCode.equals("DK")){
			Exam_Name = "Datakommunikation";
		}
		else if(examCode.equals("NP")){
			Exam_Name = "Netværkspraktik";
		}
		else if(examCode.equals("AG")){
			Exam_Name = "Algoritmer";
		}
		else { 
			Exam_Name = "No Exam Name";
		}
		return Exam_Name;	
	}
	String examScore(int ascore){
		Exam_Score = ascore + " out of 50";
		return Exam_Score;

	}
	 	String getGrade(int ascore){
		int exam_grade = 0;
		if (ascore >= 0 && ascore <= 10){
			exam_grade = 2; 
		}
		return "Du fik karakteren " + exam_grade;
	}
}