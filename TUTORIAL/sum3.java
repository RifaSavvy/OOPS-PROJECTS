import java.util.*;
class Sum
 {
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s1.nextInt();
        System.out.print("Enter the second number: ");
        int b = s1.nextInt();
        System.out.print("Enter the third number");
        int c= s1.nextInt();
        int sum = a + b + c;
        System.out.println("The sum is " + sum);
        s1.close();
    }
}