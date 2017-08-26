//This program will show working of the base and exponent classes and
//will show output on screen.
import javax.swing.JOptionPane;
public class BaseExpo 
{
	private String message;
	private double base;
	private int power;
	public BaseExpo()
	{
		message="";
		base=1;
		power=0;
	}

	public void setBase(double num){base=num;}
	public void setPower(int p){power=p;}

	private double basePower(double base,int power)
	{
		if(power==0)
			return 1;
		else 
			return base*basePower(base,power-1);
	}

   public void displayMessage()
   {
   	  message="This will calculate power of a number";
   	  message+="\nBase: "+Double.toString(base)+
   	           "\nPower: "+Integer.toString(power)+
   	           "\nValue: "+Double.toString(basePower(base,power));
   	JOptionPane.showMessageDialog(null,message);
   }
}