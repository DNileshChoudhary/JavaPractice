public class CozaLozaWoza { 
    public static void main(String[] args) { 
        int lowerLimit = 1; 
        int upperLimit = 110; 
   
        for (int num = lowerLimit; num <= upperLimit; num++)  
  { 
             
 
            if (num % 3 == 0)  
   { 
                System.out.print("Coza"); 
            } 
            if (num % 5 == 0)  
   { 
               System.out.print("Loza");  
            } 
            if (num % 7 == 0)  
   { 
               System.out.print("Woza");    
            } 
 
            if (!(num % 3 == 0 || num % 5 == 0 || num %  7== 0) )  
   { 
               System.out.print(num); 
            } 
 
            System.out.print(" "); 
 
            if (num % 11 == 0)  
   { 
                System.out.println(); 
            } 
        } 
    } 
}