/*Rifa Basheer*/
/*Roll no-51*/
import java.util.*;
class sumn {
    public static void main(String args[]) {
        int s=0;
        int num,n;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        n = s1.nextInt();
        System.out.println("Enter the string elements:");
        for (int i = 0; i < n; i++){
            num = s1.nextInt();
            {
            	s=s+num;
            }
        }
        System.out.println("The sum of the numbers are: " + s);
        s1.close();
    }
}
