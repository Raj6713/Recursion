//This class will test working of the base expo test and will show 
//working of the given class
import javax.swing.JOptionPane;
import java.io.IOException;
public class BaseExpoTest 
{
	public static void main(String[] args) throws IOException 
	{
		BaseExpo be=new BaseExpo();
		String input;
		input=JOptionPane.showInputDialog("Enter Base and power");
		be.setBase(Double.parseDouble(input.split(" ")[0]));
		be.setPower(Integer.parseInt(input.split(" ")[1]));
		be.displayMessage();
	}
}