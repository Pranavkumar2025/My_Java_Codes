package OOps;

/**
 * Constructor
 */

class Constructor_Overloading {

  String language;

  // constructor with no parameter
  Constructor_Overloading() {
    this.language = "Java";
  }

  // constructor with a single parameter
  Constructor_Overloading(String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  public static void main(String[] args) {

    // call constructor with no parameter
    Constructor_Overloading obj1 = new Constructor_Overloading();

    // call constructor with a single parameter
    Constructor_Overloading obj2 = new Constructor_Overloading("Python");

    obj1.getName();
    obj2.getName();
  }
}