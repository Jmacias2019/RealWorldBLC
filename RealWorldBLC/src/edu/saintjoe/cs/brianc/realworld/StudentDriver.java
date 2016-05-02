package edu.saintjoe.cs.brianc.realworld;

public class StudentDriver {

	public static void main(String[] args) {
		// See what we can do about our class and students
		
		int studentCount = 0;
		
		Course cmp112 = new Course("CMP112A", "B. Capouch", "Core 125");
		
		Student nextStudent = new Student("Wiley Abbott", "M", 1, 18);
		// To put data into our private array, we had to write a mutator
		//  We pass it a filled-in Student record, and our "counter" which is studentCount
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Jim Ballew", "M", 2, 19);
		cmp112.setStudent(nextStudent, studentCount++);
		nextStudent = new Student("Christine Black", "F", 1, 20);
		cmp112.setStudent(nextStudent, studentCount++);
		// Here is where I added the names of a character from a game. Then I added my name
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Sarah Kerrigan", "F", 4, 27);
		cmp112.setStudent(nextStudent, (studentCount++));
		nextStudent = new Student("Jacqueline Macias", "F", 1, 19);
		System.out.println(cmp112.toString()); 

	}

}
