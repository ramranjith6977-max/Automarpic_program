import java.util.Scanner;
class primeNumber
{
	static boolean isPrime (int num)
	{
		if(num == 2)
		  return true;
		
		if (num <= 1)
			return false;
		
		for (int i=3;i<=Math.sqrt(num) ;i++ )
		{
			if(num % i == 0)
			  return false;	
		}
		
		return true;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter Num: ");
		int num = sc.nextInt();
		System.out.println("Given Number is " + (isPrime(num) ? "Prime" : "Not Prime"));
	}
}
