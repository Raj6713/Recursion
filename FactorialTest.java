//Write a program which will check the working of the factorial class and
//will show output on sceen.
import javax.swing.JOptionPane;
import java.io.IOException;
public class FactorialTest
{
	public static void main(String[] args) throws IOException 
	{
		Factorial foo=new Factorial();
		String input;
		input=JOptionPane.showInputDialog("Enter a number: ");
		foo.setNum(Integer.parseInt(input));
		foo.displayMessage();
	}
}