package silnia;

import java.util.Scanner;

public class Silnia_3 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Ile czêœci ci¹gu chcesz? ");
		int a=s.nextInt();
		int iloczyn = 1;
		for (int i=1; i<a+1; i++) 
		{
			iloczyn *= i;
			System.out.print(iloczyn+", ");
		}
		
	}
}
