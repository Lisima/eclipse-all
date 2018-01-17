import java.util.Scanner;

public class Fibonacci_1 
{

	public static void main(String[] args) 
	{
	Scanner s =new Scanner(System.in);
	System.out.print("Ile czêœci ci¹gu chcesz? ");
	int a= s.nextInt();
	s.close();
	int f1=1;
	int f2=1;
	System.out.print(f1+", "+f2+", ");
	for(int i = 0; i<a-2;i++)
		{
		int f3=f1+f2;
		System.out.print(f3+", ");
		f1=f2;
		f2=f3;
		}

	}

}
