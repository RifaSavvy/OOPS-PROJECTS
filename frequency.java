//Program to check frequency
//Rifa Basheer
//Roll No-51
import java.util.*;
class frequency
{
	public static void main(String args[])
		{  
	        int count=0;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the String");
		String str;
		str=s1.nextLine();
		str.toLowerCase();
		System.out.println("Enter the String Characters");
		char ch= s1.next().charAt(0);
		int len=str.length();
		for(int i=0;i<len;i++)
			{
			if(str.charAt(i)==ch){
		   		count++;
		   	}
		   }
		   System.out.println("The Character Frequency is"+count);
		   s1.close();
		   }
}
