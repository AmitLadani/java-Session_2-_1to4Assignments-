import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a number: ");
		int Voter = sc.nextInt();
		if (Voter>17)
		{
			System.out.println("You are eligible to vote");	
		}
		else
		{
			System.out.println("You are Not eligible to vote");
		}
	}

}
