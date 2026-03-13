import java.util.Scanner;
class factorial 
{
	public static long isFact(int num)
	{
		if (num < 0)
		{
			System.out.println("Negative number not allowed");
			return -1;
		}
		
		long fact = 1;
		for(int i = 1;i<=num;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Enter your Number: ");
		int num = sc.nextInt();
		System.out.println(isFact(num));
	}
}
