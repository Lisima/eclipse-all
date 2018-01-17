import java.util.Scanner;

public class Liczby 
{
	static Scanner s = new Scanner(System.in);
	static int rozmiar;
	public static void wczytaj()
	{
		System.out.println("Jak du¿a liczba");
		rozmiar=s.nextInt();
	}
	public static void podaj_a(byte[] a)
	{
		for(int i = rozmiar - 1;i>=0;i--)
		{
			System.out.println("a: Podaj liczbê nr: "+(i+1)+":	");
			a[i]=s.nextByte();
		}

	}
	public static void podaj_b(byte[] b)
	{
		for(int i = rozmiar - 1;i>=0;i--)
		{
			System.out.println("a: Podaj liczbê nr: "+(i+1)+":	");
			b[i]=s.nextByte();
		}
	}
	public static void wynik(byte[] a,byte[] b,byte[] c)
	{
		byte p=0;
		for(int i=0;i<rozmiar;i++)
			{
			c[i]=(byte)(a[i]+b[i]+p);
			if(c[i]>9)
				{
				p=1;
				c[i]=(byte)(c[i]%10);
				}else p=0;
			
			}
		c[rozmiar]=p;
		for(int i=rozmiar;i>=0;i--)
			{
			System.out.print(c[i]);
			}
		}
	public static void main(String[] args) 
	{
		
	wczytaj();
	byte[] a = new byte[rozmiar];
	byte[] b = new byte[rozmiar];
	byte[] c = new byte[rozmiar + 1];
	podaj_a(a);
	podaj_b(b);
	wynik(a,b,c);
	}
}
