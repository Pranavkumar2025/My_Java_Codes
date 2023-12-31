package OOps;

/**
 * Main
 */
public class Constructor {
    public static void main(String[] args) {
        
        A pk = new A(23,43,"Jack");
        A tk = new A(23,23,"Ronald");
        
        System.out.println("Name of the Student is : " + pk.c);
        System.out.println("Name of the second student is: "+ tk.c);

        pk.sum(pk.a, pk.b);
        tk.product(tk.a, tk.b);

    }
    
}
class A {
    int a;
    int b;
    String c;

    A(int a, int b, String c){
        this.a = a;
        this.b = b;
        this.c = c;

    }
    void sum(int d, int e){
        int  s =(d+e);
        System.out.printf("Sum of %d and %d is: %d\n",d,e,s);
    }
    void product(int f,int g){
        int p = (f*g);
        System.out.printf("Product of %d and %d is: %d\n",f,g,p);
    }
}


// class Main {

//   String language;

//   // constructor with no parameter
//   Main() {
//     this.language = "Java";
//   }

//   // constructor with a single parameter
//   Main(String language) {
//     this.language = language;
//   }

//   public void getName() {
//     System.out.println("Programming Langauage: " + this.language);
//   }

//   public static void main(String[] args) {

//     // call constructor with no parameter
//     Main obj1 = new Main();

//     // call constructor with a single parameter
//     Main obj2 = new Main("Python");

//     obj1.getName();
//     obj2.getName();
//   }
// }