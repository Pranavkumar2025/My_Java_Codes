
package OOps;

/**
 * Private_Acces_Modifier
 */

//  When variables and methods are declared private, they cannot be accessed outside of the class.


public class Private_Acces_Modifier {
        public static void main(String[] main){
            Data d = new Data();
    
            // access the private variable using the getter and setter
            d.setName("Programiz");
            System.out.println(d.getName());
        
    }
}
class Data {
        private String name;
    
        // getter method
        public String getName() {
            return this.name;
        }
        // setter method
        public void setName(String name) {
            this.name= name;
        }
    }



// ----------------- > Protected access Modifier
// --------- When methods and data members are declared protected, we can access them within the same package as well as from subclasses.


// class Animal {
//     // protected method
//     protected void display() {
//         System.out.println("I am an animal");
//     }
// }

// class Dog extends Animal {
//     public static void main(String[] args) {

//         // create an object of Dog class
//         Dog dog = new Dog();
//          // access protected method
//         dog.display();
//     }
// }