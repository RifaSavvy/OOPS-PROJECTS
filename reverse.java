//Program to find reverse of a string
//Rifa Basheer
//Roll no:51
import java.util.Scanner;
class reverse {
    public static void main(String[] args) {
        String str, reverse = "";
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the string:");
        str = s1.nextLine();
        int length = str.length();

        for (int i = length - 1; i >= 0; i--)
	{
            reverse = reverse + str.charAt(i);
        }
	System.out.println("the reverse of the string is"+reverse);
        s1.close();
    }
}
