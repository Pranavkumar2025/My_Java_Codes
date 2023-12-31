package OOps;
/**
 * Main
 */
public class Method_Overloading {

  public static void main(String[] args) {
    
    Add myAdd = new Add();

    myAdd.Addition();
    myAdd.Addition(23, 320);
    myAdd.Addition(32, 20.23);
  } 
}


class Add{

  void Addition(){
    int a = 23;
    int b = 32;

    int sum = a+b;
    System.out.println("Sum of first addition is: "+sum);
  }
  void Addition(int a, int b){
    int sum = a+b;
    System.out.println("Sum of second Addition is: "+sum);
  }
  void Addition(int a, double b){
    double sum = a+b;
    System.out.println("Sum of third addition is : "+ sum);
  }
}