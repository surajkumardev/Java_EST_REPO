Q1. USE OF ABSTRACT CLASS VS THE EXTENDS
abstract class Animal {
    
    abstract void sound();
}
interface AnimalInterface {
    
    
    void soundFromInterface();
}
class Dog extends Animal implements AnimalInterface {
    
    public void sound() {
        System.out.println("Dog barks");    
    }       
   
    public void soundFromInterface() {
        System.out.println("Dog barks from interface");
    }
}
public class exp1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.soundFromInterface(); 
    }
}
