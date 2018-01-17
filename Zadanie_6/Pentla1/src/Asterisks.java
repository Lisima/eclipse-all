import java.util.Scanner;

public class Asterisks {

	public static void main(String[] args) {
	int a,b;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Podaj liczbê Wierszy:	");
	a=scanner.nextInt();
	System.out.println("Podaj liczbê Kolumn:	");
	b=scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			for(int j = 0;j<b; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
