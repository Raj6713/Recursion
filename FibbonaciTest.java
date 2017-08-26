//Write a program which will show the working of the fibbonaci test
//and will show output on screen.
import javax.swing.JOptionPane;
import java.io.IOException;
public class FibbonaciTest 
{
	public static void main(String[] args) throws IOException 
	{
		Fibbonaci foo=new Fibbonaci();
		String input;
		input=JOptionPane.showInputDialog("Enter number: ");
		foo.setUpper(Integer.parseInt(input));
		foo.displayMessage();
	}
}