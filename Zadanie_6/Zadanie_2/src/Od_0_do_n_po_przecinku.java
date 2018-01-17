import java.util.Scanner;

public class Od_0_do_n_po_przecinku 
{

static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Podaj koniec zakresu	" );
		int n = scanner.nextInt();
		for(int i=0; i<=n; i++)
		{
			System.out.print(i + ", ");
			
		}
	}
}
