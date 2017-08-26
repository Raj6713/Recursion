//This class will test working of the following class
import javax.swing.JOptionPane;
import java.io.IOException;
public class RecurVisTest 
{
	public static void main(String[] args) throws IOException 
	{
		RecurVis rv=new RecurVis();
		String input;
		input=JOptionPane.showInputDialog("Enter number");
		rv.setUpper(Integer.parseInt(input));
		
	}
}