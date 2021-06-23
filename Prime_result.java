public class Prime_result{
	public static void main(String[] args) {
		long n =4;
		// write code
		if (n==2)
		 System.out.println(1); // return 1;
		int i,result = 0;
		
		for(i = 2; i <= (n/2); i++)
		{
			if(n%i==0)
			{
				result++; // result=1
				break;
			}
		}
		if (result == 0)
			System.out.println(1);//return 1;
		else
			System.out.println(i); // retunr i;
} }