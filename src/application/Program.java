package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		Student student = new Student();
		
		
		System.out.println("Enter the student's name: ");
		student.name = scanner.nextLine();
		
		System.out.println("Enter the student's average in the first semester: ");
		student.firstSemester = scanner.nextDouble();
		System.out.println("Enter the student's average in the second semester: ");
		student.secondemester = scanner.nextDouble();
		System.out.println("Enter the student's average in the third semester : ");
		student.thirdSemester = scanner.nextDouble();
		
		System.out.println("Final Grade = " + student.annualAverage());
		student.showResult();
		
		
		scanner.close();
		
		
	}

}
