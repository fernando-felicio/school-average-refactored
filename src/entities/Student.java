package entities;

public class Student {
	
	public String name;
	public double firstSemester;
	public double secondemester;
	public double thirdSemester;
	
	public double annualAverage() {
		return this.firstSemester + this.secondemester + this.thirdSemester;
	}
	
	public void showResult() {
		if (annualAverage() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double missingPoints = 60 - annualAverage();
			System.out.printf("Missing %.2f Points", missingPoints);
		}
	}
	

}
