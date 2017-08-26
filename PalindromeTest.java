
//This program will get and set for Palindrome class and show output
import javax.swing.JOptionPane;
import java.io.IOException;
public class PalindromeTest 
{
	public static void main(String[] args) throws IOException 
	{
		Palindrome pl=new Palindrome();
		String inp;
		inp=JOptionPane.showInputDialog("Enter a string");
		pl.setPal(inp);
		pl.displayMessage();
	}
}