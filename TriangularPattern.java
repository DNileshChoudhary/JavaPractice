import java.util.*; 
public class TriangularPattern 
{ 
 public static void main(String args[]) 
 { 
  Scanner sc=new Scanner(System.in); 
  System.out.print("Enter Size of Square Pattern :"); 
  int size=sc.nextInt(); 
   
  printPatternA(size); 
  System.out.println(); 
  printPatternB(size); 
  System.out.println(); 
  printPatternC(size); 
  System.out.println(); 
  printPatternD(size); 
 } 
  
 public static void printPatternA(int size)  
 { 
  for (int row=1; row<=size; row++) 
  { 
   for (int print=1; print<=row; print++) 
   { 
    if(row>=print) 
    { 
     System.out.print("# "); 
    } 
    else 
    { 
     System.out.print(" "); 
    } 
     
   } 
     
   System.out.println(); 
  } 
 } 
  
 public static void printPatternB(int size)  
 { 
  for (int row=size; 1<=row; row--) 
  { 
   for (int print=1; print<=row; print++) 
   { 
    if(row>=print) 
    { 
     System.out.print("# "); 
    } 
    else 
    { 
     System.out.print(" "); 
    } 
     
   } 
     
   System.out.println(); 
  } 
 } 
 public static void printPatternC(int size)  
 { 
  for (int row=size; 1<=row; row--) 
  { 
   for(int i=1; i<=size-row; i++) 
   { 
    System.out.print("  "); 
   } 
    
   for (int print=1; print<=row; print++) 
   { 
    if(row>=print) 
    { 
     System.out.print("# "); 
    } 
    else 
    { 
     System.out.print(" "); 
    } 
     
   } 
    
     
   System.out.println(); 
    
  } 
   
 } 
 public static void printPatternD(int size)  
 { 
  for (int row=1; row<=size; row++) 
  { 
   for(int i=1; i<=size-row; i++) 
   { 
    System.out.print("  "); 
   } 
    
   for (int print=1; print<=row; print++) 
   { 
    if(row>=print) 
    { 
     System.out.print("# "); 
    } 
    else 
    { 
     System.out.print(" "); 
    } 
     
   } 
    
     
   System.out.println(); 
    
  } 
   
 } 
}