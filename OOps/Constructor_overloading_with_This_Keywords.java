
package OOps;

/**
 * Constructor_overloading_with_This_Keywords
 */
public class Constructor_overloading_with_This_Keywords {
    private int a, b;

    // constructor with 2 parameters
    private Constructor_overloading_with_This_Keywords( int i, int j ){
        this.a = i;
        this.b = j;
    }

    // constructor with single parameter
    private Constructor_overloading_with_This_Keywords(int i){
        // invokes the constructor with 2 parameters
        this(i, i); 
    }

    // constructor with no parameter
    private Constructor_overloading_with_This_Keywords(){
        // invokes the constructor with single parameter
        this(0);
    }

    @Override
    public String toString(){
        return this.a + " + " + this.b + "i";
    }

    public static void main( String[] args ) {
  
        // creating object of Complex class
        // calls the constructor with 2 parameters
       Constructor_overloading_with_This_Keywords c1 = new Constructor_overloading_with_This_Keywords(2, 3); 
    
        // calls the constructor with a single parameter
        Constructor_overloading_with_This_Keywords c2 = new Constructor_overloading_with_This_Keywords(3);

        // calls the constructor with no parameters
        Constructor_overloading_with_This_Keywords c3 = new Constructor_overloading_with_This_Keywords();

        // print objects
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }

    
}
