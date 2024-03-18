
public class UniversityTest {

	public static void main(String[] args) {
		University u1 = new University();
		u1.addStudent(new Student("a", "123"));
		u1.addStudent(new Student("b", "456"));
		u1.addStudent(new ScholarshipStudent("c", "789", 5000));
		u1.addStudent(new ScholarshipStudent("d", "987", 1000));
		u1.addStudent(new FamilyStudent("e", "654", 2));
		u1.addStudent(new FamilyStudent("f", "321", 3));

//		System.out.println(u1);
		u1.PrintDetails();
		System.out.println(u1.TuitionSum());
		System.out.println(u1.countFamilyStudentInLevel(2));
	}

}
