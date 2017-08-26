//This class will show working of the the Tower Of Hanoi and will
//show output.
import javax.swing.JOptionPane;
import java.io.IOException;
public class TowerOfHanoiTest 
{
	public static void main(String[] args) throws IOException 
	{
		TowerOfHanoi foo=new TowerOfHanoi();
		String input;
		input=JOptionPane.showInputDialog("Enter disks: ");
		foo.setDisk(Integer.parseInt(input));
		foo.displayMessage();
	}
}