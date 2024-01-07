import java.util.Scanner;

/**
 * Practice
 */
public class Practice {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option,pos,data;
        System.out.println("Enter the no of Element of Data: ");
        int n = sc.nextInt();
        System.out.println("Enter Your data: ");
        int arr[] = new int[100];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // int[] arr = {32,54,12,52,93,23,65};
        // int n = arr.length;

        while (true) {

            System.out.println("\n1. Display ");
            System.out.println("2. Insert at Position ");
            System.out.println("3. Deletion ");
            System.out.println("4. Searching of Your data");
            System.out.println("5. Sorting of the Data");

            System.out.println("Select the option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    Display(arr,n);
                    break;
                case 2:
                    System.out.print("Enter the Position: ");
                    pos = sc.nextInt();
                    System.out.print("Enter the data: ");
                    data = sc.nextInt();
                    n=n+1;
                    Insertion(arr,pos,data,n);
                    break;
                case 3:
                    System.out.println("Enter the Position which you want to delete: ");
                    data = sc.nextInt();
                    Deletion(arr,data,n);
                    n = n-1;
                    break;
            
                default:
                    break;
            }
            
        }

    }
    public static void Display(int[] arr, int n){
        int i;
        for(i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void Insertion(int[] arr, int pos, int data,int n){
        int i;
        for(i = n-1-1;i>= pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = data;
    }

    public static void Deletion(int[] arr,int pos,int n){
        int i;
        for(i = pos-1;i< n;i++){
                arr[i] = arr[i+1];
        }
    }

    

}
