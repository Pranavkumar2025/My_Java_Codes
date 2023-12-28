package Array_code;

import java.util.Scanner;

/**
 * myfile
 */
public class Addtion_of_two_Matrrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimesions: ");
        int n,m,i,j;
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
        System.out.println("Addition of two matrix is: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sumArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    
}