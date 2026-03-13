import java.util.Scanner;
class primeNum 
{
	static boolean isPrime (int num)
	{
		if(num == 2)
		  return true;
		
		if (num <= 1)
			return false;
		
		for (int i=3;i<=Math.sqrt(num) ;i += 2 )
		{
			if(num % i == 0)
			  return false;	
		}
		
		return true;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		System.out.print("Enter No: ");
		int num = sc.nextInt();
		System.out.println("Given No is " + (isPrime(num) ? "Prime" : "Not Prime"));
	}
}
