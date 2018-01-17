import java.util.Scanner;

public class NWD {
	int a,b;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Podaj a ");
		int a = s.nextInt();
		System.out.print("Podaj b ");
		int b = s.nextInt();
		nwd(a,b);
		int wynik=nwd(a,b);
		System.out.print(wynik);

	}
	public static int nwd(int a,int b)
	{
		if(b==0)	return a;
		else return nwd(b,a%b);
	}
}
