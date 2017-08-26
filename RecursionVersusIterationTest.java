//This class will test recurion class and show output.
import javax.swing.JOptionPane;
import java.io.IOException;
public class RecursionVersusIterationTest 
{
	public static void main(String[] args) throws IOException
	{
		RecursionVersusIteration foo=new RecursionVersusIteration();
		String input;
		input=JOptionPane.showInputDialog("Enter number: ");
		foo.setNum(Integer.parseInt(input));
		foo.displayMessage();
	}
}