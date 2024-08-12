//Program to multiply 2 matrixes
//Rifa Basheer
//Roll no-51
import java.util.Scanner;
class MultiMatrix {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        // Input size of matrices
        System.out.println("Enter the size of the matrices:");
        int n = s1.nextInt();

        // Initialize matrices
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        // Input first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s1.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = s1.nextInt();
            }
        }

        // Calculate the product of matrices
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }

        // Print the product matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        s1.close();
    }
}

