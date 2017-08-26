//This program will solve the problem of tower of Hanoi and will show 
//output on the screen.
import javax.swing.JOptionPane;
public class TowerOfHanoi
{
	private String message;
	private int disks;
	public TowerOfHanoi()
	{
		message="";
		disks=1;
	}
	public void setDisk(int num){disks=num;}
	private int getDisk(){return disks;}

	private void solveHanoi(int disks,int sPeg,int dPeg,int tPeg)
	{
		if(disks==1)
		{	message+=String.format("%d --> %d\n",sPeg,dPeg);
	       return;
	    }
	    solveHanoi(disks-1,sPeg,tPeg,dPeg);
	    message+=String.format("%d -->%d\n",sPeg,dPeg);

	    solveHanoi(disks-1,tPeg,dPeg,sPeg);
	}

	public void displayMessage()
	{
		solveHanoi(getDisk(),1,3,2);
		JOptionPane.showMessageDialog(null,message);
	}

}