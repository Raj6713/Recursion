//This program will create a file and will recursively calculate value of
//factorial and will show on screen.
import javax.swing.JOptionPane;
public class Factorial 
{
	private String message;
	private int num;
	private long fac;
	public Factorial()
	{
		message="";
		num=0;
		fac=1;
	}

	public void setNum(int n){num=n;}
	public int getNum(){return num;}

	private void calFactorial()
	{
		message="Calculation of factorial: "+
		        "\nNumber input: "+Integer.toString(num)+
		        "\n Facotrial value: "+Long.toString(getFac(getNum()));
	}

	private long getFac(int n)
	{
		if(n<=1)
			return 1;
		else
			return n*getFac(n-1);
	}

	public void displayMessage()
	{
		calFactorial();
		JOptionPane.showMessageDialog(null,message);
	}
}



