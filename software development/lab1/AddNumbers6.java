import java.util.Scanner;

public class AddNumbers6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter first number:");
		int num1 = in.nextInt();
		
		System.out.print("Please enter first number:");
		int num2 = in.nextInt();
		
		int answer = num1+num2;
		System.out.println("Answer is:" + answer);
	}	
}



