import java.util.Scanner;

public class Fibonacci_2 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Któr¹ czêœæ ci¹gu chcesz? ");
		int a= s.nextInt();
		s.close();
		int f1=1;
		int f2=1;
		int f3 = 0;
		for(int i = 0; i<a-2;i++)
		{

			f3=f1+f2;

			f1=f2;
			f2=f3;

		}
		System.out.print(f3+" ");
	}
}
