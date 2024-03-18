
import java.util.ArrayList;

public class University {
	private ArrayList<Student> students;
	
	// Constructor
	public University() {
		this.students = new ArrayList<Student>();
	}
	
	// Getters / Setters
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
		
	//Method receives a student add if there is no student with the same id in the university adds the student and return true
	//Else return false.
	public boolean addStudent(Student s) {
		for (Student i : students) {
			if(i.getId().equals(s.getId())) {
				return false;
			}
		}
		this.students.add(s);
		return true;
	}
	
	// Method returns the amount of FamilyStudents in the university based on received level.
	public int countFamilyStudentInLevel(int x) {
		int count = 0;
		for (Student i : students) {
			if(i instanceof FamilyStudent && ((FamilyStudent) i).getLevel()==x) {
				count++;
			}
		}
		return count;
	}
	
	// Calculate the total tuition price of the university.
	public double TuitionSum() {
		int total = 0;
		for (Student i : students) {
			total += i.getTuition();
		}
		return total;
	}
	
	// Method prints the details of the students in the university with their tuition.
	public void PrintDetails() {
		System.out.println("University students:");
		for (Student i : students) {
			System.out.println("\tName:" + i.getName() + ", ID:" + i.getId() + " Tuition:" + i.getTuition());
		}
	}

	// toString
	@Override
	public String toString() {
		String str = "University students:";
		for (Student i : students) {
			str += "\n\t" + i;
		}
		return str;
	}
	
	
}
