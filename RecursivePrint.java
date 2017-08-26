//This program will populate a array and will use recusrion for printing
import java.util.Random;
public class RecursivePrint 
{
	private int arrSize,arr[];
	private String message;
	public RecursivePrint()
	{
		arrSize=0;
		message="";
		arr=new int[arrSize];
	}

	public void getSize(int n)
	{
		arrSize=n;
		arr=new int[arrSize];
		allocateArray();
	   }
	private void allocateArray()
	{
		Random rand=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=100+rand.nextInt(1000);
		}
	}

	public int printArray(int[] a,int n1,int n2)
	{

		if(n1>n2)
			return 0;

		int temp=a[n1];
		System.out.printf("%d ",temp);
		if(n1<n2)
         return printArray(a,n1+1,n2);
	}

	public void displayMessage()
	{
		printArray(arr,0,arr.length-1);
	}
}