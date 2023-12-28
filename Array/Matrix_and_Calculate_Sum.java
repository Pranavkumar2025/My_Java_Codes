package Array_code;

import java.util.Scanner;
/**
 * myfile
 */
public class Matrix_and_Calculate_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------- For Matrix-------");
        System.out.println("Enter the dimension of the matrix: ");
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[3][3];//2-D array initialization 

        int i,j;
        System.out.println("Enter the data of the matrix: ");
        for (i =0;i<n;i++)
        {
            for(j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println("Data of the matrix: ");
        int sum = 0;
        for (i =0;i<n;i++)
        {
            for(j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
                sum = sum + arr[i][j];
            }
            System.out.println("\n");
        }
        System.out.println("Sum of the Matrix is:" + sum);
        System.out.println("Transpose of the matrix is : ");
        for (i =0;i<n;i++)
        {
            for(j=0;j<m;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println("\n");
        }
    
    }
}