import java.util.Scanner;

public class Asterisks {

	public static void main(String[] args) {
	int a,b;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Podaj liczb� Wierszy:	");
	a=scanner.nextInt();
	System.out.println("Podaj liczb� Kolumn:	");
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
