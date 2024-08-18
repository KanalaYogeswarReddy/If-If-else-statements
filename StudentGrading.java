import java.util.Scanner;

public class StudentGrading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = sc.nextInt();
		
		if(marks < 35) {
			System.out.println("Result: Fail");
		}
		else if(marks == 35) {
			System.out.println("Result: Pass");
		}
		else if(marks > 35 && marks <= 75) {
			System.out.println("Result: Third Class");
		}
		else if(marks > 75 && marks <= 85) {
			System.out.println("Result: Second Class");
		}
		else if(marks > 85) {
			System.out.println("Result: Third Class");
		}
	}
}
