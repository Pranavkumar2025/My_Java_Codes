//Create 2-D array storing the tabel of 5 & 10 by making a funcition
package Array_code;

import java.util.Scanner;

/**
 * myfile
 */
public class Table_of_5_and_10 {
    static void product(int[][] arr, int n, int m, int numbers){

        for(int i =1;i<=m;i++){
            arr[0][i]= numbers * i;
        }

        for(int i = 0;i<2;i++){
            for(int j=1;j<=10;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
            break;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][12];
        product(arr, 0, 10, 5);
        product(arr, 1, 10, 10);
    }

    
}