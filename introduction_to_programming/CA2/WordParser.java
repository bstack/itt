import java.util.Scanner;


public class WordParser {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String sentence = null;
		String[] words = null;
		int wordCount = 0;
		
		do
		{
			System.out.print("Please enter a sentence:");
			sentence = reader.nextLine();
			
			if(sentence.length() <= 15)
			{
				System.out.print("ERROR: You entered a sentence with " +
						sentence.length() + " characters, sentence must be greater than 15 characters\n\n");
			}
		}
		while(sentence.length() <= 15);
		
		words = sentence.split(" ");
		
		System.out.println("\n\nSENTENCE WORD BREAKDOWN");
		System.out.println("-------------------------");
		for(int i=1;i<=words.length;i++)
		{
			System.out.println("Word " + i + ":\t" + words[i-1]);
		}

	}

}
