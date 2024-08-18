import java.util.Scanner;

public class DayChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day");
		String week = sc.nextLine();
		
		if(week.equals("monday") || week.equals("tuesday") || week.equals("wednesday") || week.equals("thursday") || week.equals("friday")) {
			System.out.println("Uff,it's a weekday");
		}
			else if(week.equals("saturday") || week.equals("sunday")){
				System.out.println("yayy it's a weekend");
		}
	}
}
