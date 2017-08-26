//This program will test working of the gcd class and will show output
//on screen
import javax.swing.JOptionPane;
import java.io.IOException;
public class GcdTest 
{
	public static void main(String[] args) throws IOException 
	{
		Gcd gcp=new Gcd();
		String input;
		input=JOptionPane.showInputDialog("Enter two numbers");
		gcp.setNum1(Integer.parseInt(input.split(" ")[0]));
		gcp.setNum2(Integer.parseInt(input.split(" ")[1]));
		gcp.displayMessage();
	}
}