import java.util.Scanner;
class PerfectNum
{
    public static boolean isPerfect(int n)
    {
        int sum = 0;

        for (int i = 1; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                sum = sum + i;
            }
        }

        return sum == n;
    }
	
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
		System.out.print("Enter your Number: ");
        int n = sc.nextInt();

        if (isPerfect(n))
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect");
    }
}