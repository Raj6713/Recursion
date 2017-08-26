//This class will define method such that it will write function 
//for recursion and iteration.
import javax.swing.JOptionPane;
public class RecursionVersusIteration 
{
	private String message;
	private int num,countIter,countRecur;
	private long fac;
	public RecursionVersusIteration()
	{
		message="";
		num=0;
		countIter=0;
		countRecur=0;
		fac=1;
	}

	public void setNum(int n){num=n;}
	private int getNum(){return num;}

	private long calcIter(int num)
	{
		countIter++;
		while(num>0)
		{
			fac=fac*num;
			num--;
		}
		return fac;
	}

	private long calcRecur(int num)
	{
		countRecur++;
		if(num<=1)
			return 1;
		else 
			return num*calcRecur(num-1);
	}
	public void displayMessage()
	{
		message="Comparison between Recursion and Iteration\n";
		message+="Recursion: "+Integer.toString(getNum())+" "+
		                       Long.toString(calcRecur(getNum()))+" "+
		                       Integer.toString(countRecur);
	    message+="\nIteration: "+Integer.toString(getNum())+" "+
		                       Long.toString(calcIter(getNum()))+" "+
		                       Integer.toString(countIter);
		JOptionPane.showMessageDialog(null,message);
	}
}