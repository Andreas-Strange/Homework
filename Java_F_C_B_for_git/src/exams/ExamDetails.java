package exams;

public class ExamDetails {
	public static void main(String[] args) {
		
		StudentResults aStudent = new StudentResults();
		TUI scanned = new TUI();
		
		aStudent.writeFirstname();
		String scfirstname = scanned.enterFirstname();		
		String fName = aStudent.fullName(scfirstname);
		
		aStudent.writeFamilyname();
		String scfamilyname = scanned.enterFirstname();		
		String faName = aStudent.fullName(scfamilyname);
		
		
		aStudent.writeCode();
		
		String sccode = scanned.enterCode();
		String eName = aStudent.examName(sccode);
		String score = aStudent.examScore(30);
		String grade = aStudent.getGrade(5);
		
		System.out.println(fName + " " + faName);
		System.out.println(eName);
		System.out.println(score);
		System.out.println(grade);
	}

}
