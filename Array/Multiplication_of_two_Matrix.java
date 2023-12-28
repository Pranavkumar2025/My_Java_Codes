package Array;

import java.util.Scanner;

public class Multiplication_of_two_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimesions: ");
        int n,m,i,j,k;
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr1 = new int[n][m];
        int[][] arr2 = new int[n][m];
        int[][] sumArr = new int[n][m];
        System.out.println("Enter the Data of first Matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Data of second Matrix: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        int prd =0;
        int sum =0;
        System.out.println("Multiplications of two matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                sum=0;
                for(k = 0;k<m;k++){
                    prd = arr1[i][k] *arr2[k][j];
                    sum = sum+prd;
                }
                sumArr[i][j]=sum;
                System.out.print(sumArr[i][j]+" ");
            }
            System.out.println();
        }
    }
 
}