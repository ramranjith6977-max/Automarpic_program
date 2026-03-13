// A number is Armstrong if
// Sum of (each digit ^ total digits) = original number

class AmstrongNum 
{
	public static boolean isAmstrong(int n)
	{
		int og = n;
		int count=0;
		int sum = 0;
		int temp = n;
		
		//count digits
		while(temp > 0)
		{
			count++;
		    temp = temp/ 10;
		}
		temp = n;
		
		// sum of digit^ count
		while(temp > 0)
		{
			int ld = temp % 10;
			sum = sum + (int)Math.pow(ld,count);
			temp = temp/10;
		}
		return (sum == og);
	}
	public static void main(String[] args) 
	{
		int n = 153;
		if(isAmstrong(n))
			System.out.println( n +"Amstrong number");
		else
			System.out.println(n + "Not Amstrong Number");
	}
}
