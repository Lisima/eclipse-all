import java.util.Scanner;

public class Suma {

	public static void main(String[] args) 
	{
		int suma = 0;
		Scanner scanner = new Scanner(System.in);
		for(int i=1; i<=15; i++)
		{
			
			System.out.println("Podaj Liczbê " );
			int a = scanner.nextInt();
			
			suma = suma + a;
			
		}
		System.out.println("Wynik to " +suma );
		scanner.close();
	}

}
