/**
 * @(#)AverageGrade.java
 *
 *
 * @author - Denis Mulvihill
 * @version 1.00 2013/10/24
 */

import java.util.Scanner;
import java.text.*;

public class AverageGrade {

    public static void main (String[] args) {
    	
    	//declarations and input
    	
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("Enter your mark for Maths");
    	int mathsMark = reader.nextInt();
    	
    	System.out.println("Enter your mark for Science");
    	int scienceMark = reader.nextInt();
    		
    	System.out.println("Enter your mark for Geography");
    	int geographyMark = reader.nextInt();
    	
    	double averageMark = (mathsMark + scienceMark + geographyMark)/3;
    	DecimalFormat df1 = new DecimalFormat("#.000");
    	String roundedAverage = df1.format(averageMark);
    	//Double roundedAverage2 = Double.parseDouble(roundedAverage);
    	
    	String grade;
    	
    	//if-else statement
    	
    	if (averageMark <= 40)
    	{
    		grade = "Pass";
    	}
    	
    	else if (averageMark > 40 && averageMark <= 69)
    	{
    		grade = "Merit";
    	}
    	
    	else
    	{
    		grade = "Distinction";
    	}
    	
    	//printing out results
    	
    	System.out.println("Maths mark: " + "\t\t\t\t\t\t" + mathsMark + "\n" 
    						+ "Science mark: " + "\t\t\t\t\t\t" + scienceMark + "\n"
    						+ "Geography mark: " + "\t\t\t\t\t" + geographyMark + "\n" 
    						+ "Average mark: " + "\t\t\t\t\t\t" + roundedAverage + "\n"
    						+ "Grade" + "\t\t\t\t\t\t\t\t" + grade);
    						
    }
    
    
}