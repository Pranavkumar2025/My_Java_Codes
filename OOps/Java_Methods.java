package OOps;

/**
 * Main
 */
class Java_Methods {

  // method with no parameter
  public void display1() {
    System.out.println("Method without parameter");
  }

  // method with single parameter
  public void display2(int a) {
    System.out.println("Method with a single parameter: " + a);
  }
  public int Product(int a,int b) {
    return a*b;
  }

  public static void main(String[] args) {
    
    // create an object of Main
    Java_Methods obj = new Java_Methods();

    // calling method with no parameter
    obj.display1();
    
    // calling method with the single parameter
    obj.display2(24);

    int result = obj.Product(23, 12);
    System.out.println("Product result is: " +result);
  }
}