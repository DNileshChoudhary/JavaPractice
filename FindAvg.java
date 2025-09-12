class FindAvg
{
     public static void main(String args[])
	 {
	    int n1,n2,n3;
		float avg;
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		n3 = Integer.parseInt(args[2]);
		avg =(n1+n2+n3)/3;
		System.out.println("Average = "+avg);
	 }
}