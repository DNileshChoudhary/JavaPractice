import java.util.*; 
public class TimeTable 
{ 
 public static void main(String args[]) 
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.print("Enter Size of Time Table :"); 
  int size=sc.nextInt(); 
   
  System.out.print(" * |"); 
  for (int i=1; i<=size; i++) 
  { 
   System.out.printf("%4d", i); 
  } 
  System.out.println(); 
  for (int i=1; i<=size+1; i++) 
  { 
   System.out.print("----"); 
  } 
  System.out.println(); 
  for (int i=1; i<=size; i++) 
  { 
   System.out.printf("%2d |", i); 
   for (int j=1; j<=size; j++) 
   { 
    System.out.printf("%4d", i * j); 
   } 
   System.out.println(); 
  } 
   
 } 
}