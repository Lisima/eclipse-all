import java.util.Scanner;

public class Liczby_parzyste 
{
	static Scanner scanner = new Scanner(System.in);	

	public static void main(String[] args) 
	{
		System.out.println("Podaj koniec zakresu	" );
		int n = scanner.nextInt();
		for( int i=0; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i + ", ");
			}
		}
		

	}

}
