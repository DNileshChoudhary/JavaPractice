class PrintDayInWord1
{
	public static void main(String args[])
	{
		int num=5;
		{System.out.println("Given day is "+num);}
		switch(num){
		case 1 : 
		System.out.println("Day in word = Sunday");
		break;
		case 2 : 
		System.out.println("Day in word = Monday");
		break;
		case 3 : 
		System.out.println("Day in word = Tuesday");
		break;
		case 4 : 
		System.out.println("Day in word = Wednesday");
		break;
		case 5 : 
		System.out.println("Day in word = Thursday");
		break;
		case 6 : 
		System.out.println("Day in word = Friday");
		break;
		case 7 : 
		System.out.println("Day in word = Saturday");
		break;
		default :
		System.out.println("It is not a Day,Try again!");
		break;}
	}
}