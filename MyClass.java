interface InterfaceA { 
void display(); 
} 
interface InterfaceB { 
void display(); 
} 
public class MyClass implements InterfaceA, InterfaceB { 
@Override 
public void display() { 
System.out.println("Implementation of display method."); 
} 
}