import java.util.Scanner;

public class mnozenie {

	public static void main(String[] args) 
	{
		double a, b, mnozenie,dzielenie,odejmowanie,dodawanie,pierwiastekza,adob;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Podaj pierwsz¹ liczbê		");
		a =scanner.nextInt();
		System.out.print("Podaj nastêpn¹ liczbê		");
		b =scanner.nextInt();
		scanner.close();
		
		mnozenie=a*b;
		System.out.println("Wynik to mnozenia:		"+mnozenie);
		
		dzielenie=a/b;	
		System.out.println("Wynik to dzielenia:		"+dzielenie);
		
		dodawanie=a+b;
		System.out.println("Wynik to dodawania:		"+dodawanie);
		
		odejmowanie=a-b;
		System.out.println("Wynik to odejmowania:		"+odejmowanie);
		
		pierwiastekza=Math.sqrt(a);
		System.out.println("pierwiastek wyniosi:		"+pierwiastekza);
		
		adob=Math.pow(a,b);
		System.out.println("poitêga wynosi:			"+adob);
		
	}

}
