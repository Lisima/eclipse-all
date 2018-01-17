import java.util.Scanner;

public class Fibonacci_3 
{
	static Scanner s =new Scanner(System.in);
	public static int Fib (int ktory)
	{
		if(ktory==0)return 0;
		if(ktory==1)return 1;
		if(ktory==2)return 1;
		if(ktory>2)return Fib(ktory-1)+Fib(ktory-2);
		return 0;
		
	}
	public static void main(String[] args) 
	{
		System.out.print("Który elemen ci¹gu chcesz ");
		int ktory=s.nextInt();
		int wynik =Fib(ktory);
		System.out.print("Wybrany element ciagu to "+wynik);
	}
	
}
