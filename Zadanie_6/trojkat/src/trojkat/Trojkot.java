package trojkat;

import java.util.Scanner;

public class Trojkot {

	public static void main(String[] args) {
		int a,b,c;

		Scanner scanner =new Scanner(System.in);
		System.out.println("Podaj liczb� a:");
		a = scanner.nextInt();
		System.out.println("Podaj liczb� b:");
		b = scanner.nextInt();
		System.out.println("Podaj liczb� c:");
		c = scanner.nextInt();
		scanner.close();
		if(a<0 && b<0 && c<0)
		{

			if (a<b+c && b<a+c && c<a+b)
			{
				System.out.println("Powstanie tr�jk�t");
			}else 
			{
				System.out.println("Nie powstanie tr�jk�t");
			}
		}else
		{
			System.out.println("Nie powstanie tr�jk�t");
		}
	
	}

}

