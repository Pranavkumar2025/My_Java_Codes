import java.util.Scanner;

/**
 * Practice
 */
public class Practice {

    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your number: ");
        n = sc.nextInt();

        int option,pos,data;
        int[] arr = {32,54,12,52,93,23,65};

        while (true) {

            System.out.println("\n1. Display ");
            System.out.println("2. Insert at Position ");
            System.out.println("3. Delettion ");
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
                    Insertion(arr,pos,data,n);

            
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
        for(i = 0;i<pos;i++){

        }
    }

    

}
