//Write a program which will visualize the recursion and will show 
//output 
//import package
import javax.swing.JOptionPane;
//Class Declaration
public class RecurVis 
{
	private String message;
	private int upperLimit;
	public RecurVis() 
	{
		message="";
		upperLimit=1;
	}

	public void setUpper(int num){upperLimit=num;hanoi(upperLimit);}
	public long hanoi(int upperLimit)
	{
		long temp;
		if(upperLimit==0 || upperLimit==1)
			return upperLimit;
		else
			{   System.out.printf("%d %ld\n",upperLimit,hanoi(upperLimit-1)+hanoi(upperLimit-2));
				return hanoi(upperLimit-1)+hanoi(upperLimit-2);}
	}

}
//Code need to be reviewd related to the printing of stack