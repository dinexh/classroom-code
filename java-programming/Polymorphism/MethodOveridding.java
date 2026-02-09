// Parent class Animal 
class Animal  
{ 
// Creating place method 
void place()  
{ 
System.out.println("Animals live on earth."); 
} 
} 
// Dog class extends Animal class 
class Dog extends Animal  
{ 
// Overriding place method 
void place()  
{ 
System.out.println("Dog lives in a kennel."); 
} 
} 
// Horse class extends Animal class 
class Horse extends Animal  
{ 
// Overriding place method 
void place()  
{ 
System.out.println("Horse lives in a stable."); 
} 
} 
// Rabbit class extends Animal class 
class Rabbit extends Animal  
{ 
// Overriding place method 
void place()  
 { 
          System.out.println("Rabbit lives in a burrow."); 
     } 
} 
 public class MethodOveridding  
{ 
 public static void main(String[] args)  
 { 
          // Creating an object of Animal class 
          Animal animal = new Animal(); 
          animal.place(); // Output: Animals live on earth. 
             // Using polymorphism to assign a Dog object to an Animal reference 
          Animal dog = new Dog(); 
          dog.place(); // Output: Dog lives in a kennel. 
              // Using polymorphism to assign a Horse object to an Animal reference 
          Animal horse = new Horse(); 
          horse.place(); // Output: Horse lives in a stable. 
  // Using polymorphism to assign a Rabbit object to an Animal reference 
          Animal rabbit = new Rabbit(); 
          rabbit.place(); // Output: Rabbit lives in a burrow. 
     } 
}