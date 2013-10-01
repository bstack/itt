
import java.util.UUID;

public class BooleanExpressions {

	public static void main(String[] args) {
		
		// Some boolean expressions
		int i = 5;
		int j = 10;
		boolean result;
		
		result = (i == 5);			//	true	The value of i is 5.
		System.out.println(result);
		
		result = (i == 10);			//	false	The value of i is not 10.
		System.out.println(result);
		
		result = (i == j);			//	false	i is 5, and j is 10, so they are not equal.
		System.out.println(result);
		
		result = (i == j - 5);		//	true	i is 5, and j – 5 is 5.
		System.out.println(result);
		
		result = (i > 1);			//	true	i is 5, which is greater than 1.
		System.out.println(result);
		
		result = (j == i * 2);		//	true	j is 10, and i is 5, so i * 2 is also 10.
		System.out.println(result);

	}

}
