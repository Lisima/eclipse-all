import java.util.Scanner;

public class Funkcje 
{
	static Scanner scanner = new Scanner(System.in);
	public static int skaner()
	{
		
		return scanner.nextInt();
	}
	public static double mojePolicz()
	{
		double wynik=100/20;
		System.out.println("Jestem bez wej�cia");
		return wynik;
	}
	public static double mojePolicz(int a)
	{
		double wynik=a/20;
		System.out.println("jestem z wej�ciem");
		return wynik;
	}
	public static void main(String[] args) 
	{
		int a=skaner();
		double w = mojePolicz(a);
		
		System.out.println("Start programu");
		System.out.println("Wynik:	"+ w);
		System.out.println("Koniec programu");
	}	
}
