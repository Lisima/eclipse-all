import java.util.Scanner;

public class Od_n_do_0 {

static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Podaj pocz¹tek zakresu	" );
		int n = scanner.nextInt();
		for(int i = n  ; i>=0; i--)
		{
			System.out.print(i + ", ");
			
		}
	}
}
