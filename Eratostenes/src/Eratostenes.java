import java.util.Scanner;

public class Eratostenes 
{
	int a;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int a =s.nextInt();
		System.out.print("Wypisz liczby parzyste do:	");
		boolean[] sito = new boolean[a];
		erasito(sito);
		for(int i=0;i<sito.length;i++)
		{
			if(sito[i]==true)	System.out.println(i);
		}

	}

	private static void erasito(boolean[] sito) 
	{
		for(int i = 0; i < sito.length;i++)
		{
			sito[i] = true;
		}
		sito[0]=false;
		sito[1]=false;
		int koniec = sito.length/2;
		for(int i = 2; i<koniec;i++)
		{
			for (int j = i+i; j<sito.length;j=j+i)
			{
				sito[j]=false;
			}
		}
	}

}
