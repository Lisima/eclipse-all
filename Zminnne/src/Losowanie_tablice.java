import java.util.Random;
import java.util.Scanner;

public class Losowanie_tablice 
{
	static Scanner scanner = new Scanner(System.in);
	public static int skaner()
	{	
		return scanner.nextInt();
	}
	static Random random = new Random();
	public static void losujLiczby(int[] liczby, int start)
	{
		for(int i=0;i<liczby.length ;i++)
		{
			liczby[i] = random.nextInt() % 10;
			if(liczby[i]<0) liczby[i]*=-1;
			liczby[i]+=start;
		}
	}
	public static void losujLiczby(int[] liczby)
	{
		losujLiczby(liczby,0);
	}
	public static void wypisz(int[] liczby)
	{
		for(int i=0;i<liczby.length ;i++)
		{
			if(i<liczby.length-1)
				System.out.print(liczby[i]+", ");
		}
	}
	public static void sortuj(int[] a)
	{
		for (int i=a.length-1;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					int bok=a[j];
					a[j]=a[j+1];
					a[j+1]=bok;
				}	
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] liczby = new int[10000];
		System.out.print("podaj liczbê:	");
		int a=skaner();
		losujLiczby(liczby,a);
		sortuj(liczby);
		System.out.print("\n");
		wypisz(liczby);
		
	}
}
