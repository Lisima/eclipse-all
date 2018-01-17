import java.util.Scanner;

public class Tablice 
{
	public static void wczytaj(int[] a)
	{
		Scanner scanner=new Scanner(System.in);	
		for(int i=0;i<a.length;i++)
		{
			System.out.print("podaj liczbe \n");
			a[i]=scanner.nextInt();
		}	
		scanner.close();

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
	public static void wypisz(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}
	public static void dodaj(int[] a)
	{
		int suma = 0;
		for(int i=0;i<a.length;i++)
		{
			suma=suma+a[i];
		}
		System.out.println(suma);
	}

	
	
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		wczytaj(a);
		sortuj(a);
		wypisz(a);
		dodaj(a);
	}
}