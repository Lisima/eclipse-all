
public class Hello 
{

	public static void main(String[] args) 
	{
		int sum=0;
		
		for(int i=0; i<=10; i++)
		{
			sum= sum+i;
			System.out.println(i);
			System.out.print(": ");
			System.out.println(sum);
		}
		System.out.print("Ostateczny wynik:");
		System.out.println(sum);
		
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);
	}
}