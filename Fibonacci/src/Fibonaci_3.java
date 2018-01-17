import java.util.Scanner;

public class Fibonaci_3 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Któr¹ czêœæ ci¹gu chcesz? ");
		int ktory = s.nextInt();
		s.close();
		Fib(ktory);
		System.out.print(Fib(ktory));

	}
	public static int Fib(int ktory)
	{
		if(ktory==0)return 0;
		if(ktory==1)return 1;
		if(ktory==2)return 1;
		if(ktory>2)return Fib(ktory-1)+Fib(ktory-2);
		return 0;
		
	}

}
