import java.util.*;
class arrsum
{
	public static void main(String args[])
	{
	  int s=0;
	  int a[]=new int[100];
	  Scanner s1=new Scanner(System.in);
	  System.out.println("Enter the Array Limit:");
	  int n=s1.nextInt();
	  System.out.println("Enter the Array Elements:");
	  for(int i=0;i<n;i++)
	  {
	  	a[i]=s1.nextInt();
	  }
	   for(int i=0;i<n;i++)
	  {
	  	s=a[i]+s;
	  }
	  System.out.println("The Sum of the Array is"+s);
	  s1.close();
	 }
}	  		  
