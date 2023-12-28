package Array_code;

import java.util.Scanner;

/**
 * myfile
 */
public class Sum_of_Individual_Row_and_Column {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimesions: ");
        int n,m,i,j;
        n = sc.nextInt();
        m = sc.nextInt();

        int[][] arr = new int[3][3];
        System.out.println("Enter the Data: ");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sumrow,sumcol;
        System.out.println("Matrix is: ");
        for(i=0;i<n;i++){
            sumrow = 0;
            sumcol = 0;

            for(j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
                sumrow = sumrow + arr[i][j];
                sumcol = sumcol + arr[j][i];
            }
            System.out.print((i+1)+"st row sum ="+ sumrow +"  ->");
            System.out.print((i+1)+"st col sum ="+ sumcol );
            System.out.println();
        }

    }

    
}