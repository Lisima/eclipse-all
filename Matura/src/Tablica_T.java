import java.util.Scanner;

public class Tablica_T 
{
	static Scanner s = new Scanner(System.in);
	static int k;
	static int n;

	public static void ilosc()
	{
		System.out.print("Ile chcesz liczb\n");
		k = s.nextInt();
	}
	
	public static void liczby(int[] tab)
	{
		for (int i = 0; i < k;i++)
		{
			System.out.print("podaj liczbe \n");
			tab[i]=s.nextInt();
		}
	}
	
	public static int max (int[] tab)
	{
		int max = Integer.MIN_VALUE;

		for(int i = 0;i<k;i++)
		{
			if((tab[i] > max)&&(tab[i]!=0))
			{
				max = tab[i];

			}
		}		
		return max;
	}

	public static void wypisz(int[] zlicz,int n)
	{
		for(int i=0;i<n;i++)
		{
		
			System.out.print(zlicz[i]+", ");
		}
	}
	
	public static void zeruj(int max,int Z[])
	{
		for (int i = 0; i < max;i++)
		{
			Z[i]=0;
		}
	}
	
	public static void n()
	{
		for (int i = 0; i <= k-1;i++)
		{
			n++;
		}
	}
	
	public static void main(String[] args) 
	{
		ilosc();
		int T[]=new int[k];
		liczby(T);
		max(T);
		int Z[]=new int[k];
		zeruj(k,Z);
		n();

		
		for (int i = 0; i < n;i++)
		{
			
			Z[T[i]]=Z[T[i]]+1;
		}
		wypisz(Z,n);
	
	 
	}

}