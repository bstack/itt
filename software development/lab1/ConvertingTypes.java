
public class ConvertingTypes {

	public static void main(String[] args) {
		
		String numString1 = "25";
		String numString2 = "30";
		String numStringResult = numString1+numString2;
		System.out.println(numStringResult);
		
		int num1 = Integer.parseInt(numString1);
		int num2 = Integer.parseInt(numString2);
		int numResult = num1+num2;
		System.out.println(numResult);
	}

}
