import java.util.Scanner;

public class Rownanie 
{

	public static void main(String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("Podaj a");
		double a=scanner.nextDouble();
		System.out.println("Podaj b");
		double b=scanner.nextDouble();
		System.out.println("Podaj c");
		double c=scanner.nextDouble();

		if(a==0)
		{

			if(b==0)
			{

				if(c==0)
				{
					System.out.println("Niesko�czenie wiele rozwi�za�");
				}

				if(c!=0)
				{
					System.out.println("Brak rozwi�za�");
				}

			}

			if(b!=0)
			{
				double x=-c/b;
				System.out.println("Rozwiazaniem r�wnania jest:	"+x);
			}

		}

		if(a!=0)
		{
			double delta = b*b-4*a*c;

			if (delta<0)
			{
				System.out.println("Brak rozwi�za�");
			}

			if (delta==0)
			{
				double x3=-b/2*a;
				System.out.println("Rozwiazaniem r�wnania jest:	"+x3);
			}

			if (delta>0)
			{
				double x1=(-b-(int)Math.sqrt(delta)/2);
				double x2=(-b+(int)Math.sqrt(delta)/2);
				System.out.println(" x1 wynosi"+x1+"\n x2 wynosi"+x2);
			}

		}

		scanner.close();

	}

}
