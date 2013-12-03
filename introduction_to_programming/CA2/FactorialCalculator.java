import javax.swing.JOptionPane;


public class FactorialCalculator {

	public static void main(String[] args) {
		
		String numberAsString = JOptionPane.showInputDialog("Please enter a number:");
		int number = Integer.parseInt(numberAsString);
		String output = "";
		
		int numberToMultiply = number-1;
		output = number + "! = " + number + " X ";
		int accumulatedAnswer = number;
		
		while(numberToMultiply>1)
		{
			accumulatedAnswer *= numberToMultiply;
			output+=numberToMultiply + " X ";
			
			numberToMultiply--;
		}
		
		output+= "1 = " + accumulatedAnswer;
		
		JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);
	}
}


