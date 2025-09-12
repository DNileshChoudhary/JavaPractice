import java.util.Scanner; 
 
public class CalculatePi { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number of Denominators : ");
         int n = sc.nextInt(); 
 
        double piApproximation = computePi(n); 
 
        System.out.println(piApproximation); 
    } 
 
    public static double computePi(int n)  
    { 
        double pi = 0.0; 
        for (int i = 0; i < n; i++) { 
            int sign = (i % 2 == 0) ? 1 : -1; 
            pi += sign * 4.0 / (2 * i + 1); 
        } 
        return pi; 
    } 
} 