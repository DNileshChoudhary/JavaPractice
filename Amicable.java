import java.util.*;
class Amicable  //  Automorphic
{ 
    public static void main(String[] args) 
    { 
         
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter number= "); 
        
    int num = sc.nextInt(); 
   
  int sq=num*num; 
    
  String s = Integer.toString(num); 
  int length = s.length(); 
       
  int a=sq%(int)Math.pow(10,length); 
        
        if (num == a) 
        { 
            System.out.println("Automorphic Number"); 
        } 
        else 
        { 
            System.out.println("Not Automorphic Number"); 
        } 
      }
}