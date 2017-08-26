//Write a program which will check whatever a string is palindrome
// or not and will show output.
import javax.swing.JOptionPane;

public class Palindrome 
{
	private String input,message;
	private boolean flag;
	public Palindrome()
	{
      flag=false;
      message="";
	}
	public void setPal(String s){input=s;}

	public boolean testPalindrome(String inp,int n1,int n2)
	{
		if(n1==n2)
			return true;
		if(inp.charAt(n1)!=inp.charAt(n2))
			return false;
		if(n1<n2+1)
			return testPalindrome(inp,n1+1,n2-1);

		return true;
	}

	public void displayMessage()
    {
    	message+="Message is: "+input+
    	          "\nThis String is Palindrome?"+Boolean.toString(testPalindrome(input,0,input.length()-1));
    	JOptionPane.showMessageDialog(null,message);          
    }
}