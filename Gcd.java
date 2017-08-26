//Write a program which will print the greatest common divisor of given
//number
import javax.swing.JOptionPane;
public class Gcd 
{
	private String message;
	private int num1,num2;
	public Gcd()
	{
		message="";
		num1=num2=1;
	}

	public void setNum1(int n){num1=n;}
	public void setNum2(int n){num2=n;}

	private int getNum1(){return num1;}
	private int getNum2(){return num2;}

	public int getGcd(int num1,int num2)
	 {
	 	message+="Num1: "+Integer.toString(num1)+"  Num2: "+Integer.toString(num2)+"\n";
		if(num2==0)
			return num1;
		else
			return getGcd(num2,num1%num2);
	}

	public void displayMessage()
	{
		getGcd(getNum1(),getNum2());

		JOptionPane.showMessageDialog(null,message);
		JOptionPane.showMessageDialog(null,Integer.toString(getGcd(getNum1(),getNum2())));
	}
}