import java.util.Scanner;

public class Przedzia³_obustronnie_otwarty 
{
	static Scanner scanner = new Scanner(System.in);	
	public static void main(String[] args) 
	{
		System.out.println("Podaj a:	" );
		int a = scanner.nextInt();
		System.out.println("Podaj b:	" );
		int b = scanner.nextInt();
		for(int i = a+1 ;i < b ;i++ )
		{ 
			
			System.out.print(i + ", ");
		
			
		}
	}

}
