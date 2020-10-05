
public class Student implements Comparable<Student> {
	String fullName;
	String department;
	double gpa;
	
	public Student(String fullName, String department, double gpa) {
		this.fullName = fullName;
		this.department = department;
		this.gpa = gpa;
	}
	
	public int compareTo(Student that) {
		if(this.gpa > that.gpa) return 1;
		else if(this.gpa < that.gpa) return -1;
		else return 0;
		
	}

}
