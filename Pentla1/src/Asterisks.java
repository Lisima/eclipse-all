import java.util.Scanner;

public class Asterisks {
	public static void main(String[] args) {
	int a,b; //a-wiersze b-kolumny
	Scanner scanner= new Scanner(System.in);
	System.out.print("Podaj liczbê Wierszy:	");
	a=scanner.nextInt();
	System.out.print("\n");
	System.out.print("Podaj liczbê Kolumn:	");
	b=scanner.nextInt();
	System.out.print("\n");
	System.out.print("Podaj znak:	");
	String text= scanner.next();
	char c=text.charAt(0);
	System.out.print("\n");
	scanner.close();
		for(int i=0;i<a;i++) {
//			System.out.print(i+1+".	");
			for(int j = 0;j<b; j++) {		
				System.out.print(c);
			}
			System.out.println("");
		}
	}
}