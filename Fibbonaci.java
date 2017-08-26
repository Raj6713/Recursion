//This class based java program will show the workng of the fibbonaci
//number and will show output on screen.
import javax.swing.JOptionPane;
public class Fibbonaci 
{
	private String message;
	private int upperLimit;
	public Fibbonaci()
	{
		message="";
		upperLimit=1;
	}
    
    public void setUpper(int num){upperLimit=num;}
    private int getUpper(){return upperLimit;}
	
	private long calcFibboo(int num)
	{
		if(num==0 || num==1)
			return num;
		else
			return calcFibboo(num-1)+calcFibboo(num-2);
	}

	public void displayMessage()
	{
		message="Fibbonaci values upto provided upper limit:\n";
		for(int i=0;i<getUpper();i++)
		{
			message+="Number: "+Integer.toString(i)+"  ";
			message+="Value: "+Long.toString(calcFibboo(i))+"\n";
		}

		JOptionPane.showMessageDialog(null,message);

	}
}