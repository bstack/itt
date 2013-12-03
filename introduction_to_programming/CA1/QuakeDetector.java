/**
 * @(#)QuakeDetector.java
 *
 *
 * @author - Denis Mulvihill
 * @version 1.00 2013/10/24
 */

import javax.swing.*;

public class QuakeDetector {

    public static void main (String[] args) {
    	
    	//declarations and conversion
    	
    	String quakeValue = JOptionPane.showInputDialog(null,"Please enter the richter scale measurment for the earthquake");
    	int richterMeasurement = Integer.parseInt(quakeValue);
    	
    	String oneToThree = "Detectable only by Instuments";
    	String four = "Detectable within 32km of epicenters";
    	String five = "May cause slight damage";
    	String six = "Moderatley destructive";
    	String seven = "A major earthquake";
    	String eight = "A very destructive earthquake";
    	String nine = "A catastrophe";
    	String title = "Earthquake Tester";
    	String error = "Incorrect earthquake measurment value entered";
    	
    	//switch statement
    	
    	switch (richterMeasurement) {
	
			case 1 : 
			JOptionPane.showMessageDialog(null,oneToThree,title,JOptionPane.INFORMATION_MESSAGE);	
			break;
	
			case 4 :
			JOptionPane.showMessageDialog(null,four,title,JOptionPane.INFORMATION_MESSAGE);	 
			break;
		
			case 5 :
			JOptionPane.showMessageDialog(null,five,title,JOptionPane.INFORMATION_MESSAGE);		 
			break;
			
			case 6 :
			JOptionPane.showMessageDialog(null,six,title,JOptionPane.INFORMATION_MESSAGE);		 
			break;
			
			case 7 :
			JOptionPane.showMessageDialog(null,seven,title,JOptionPane.INFORMATION_MESSAGE);		 
			break;
			
			case 8 :
			JOptionPane.showMessageDialog(null,eight,title,JOptionPane.INFORMATION_MESSAGE);		 
			break;
			
			case 9 :
			JOptionPane.showMessageDialog(null,nine,title,JOptionPane.INFORMATION_MESSAGE);		 
			break;
			
			default :
			JOptionPane.showMessageDialog(null,error,"Error",JOptionPane.ERROR_MESSAGE);	
				
}
    	
    	
    }
    
    
}