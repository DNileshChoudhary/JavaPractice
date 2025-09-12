import java.util.Scanner; 
 
public class DisariumNumber 
{ 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
  System.out.print("Enter a number: "); 
        int number = scanner.nextInt(); 
  int num=number; 
 
  if (num <= 0)  
  { 
             System.out.println(number + " is not an Ugly Number"); 
        } 
 
         
        while (num % 2 == 0)  
  { 
            num /= 2; 
        } 
        while (num % 3 == 0)  
  { 
            num /= 3; 
        } 
        while (num % 5 == 0)  
  { 
            num /= 5; 
        } 
   
         
        if (num == 1)  
  { 
            System.out.println(number + " is an Ugly Number"); 
        } else  
  { 
            System.out.println(number + " is not an Ugly Number"); 
        } 
    } 
 
    
}