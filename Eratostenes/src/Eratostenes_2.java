import java.util.Scanner;

public class Eratostenes_2 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		
		int a =1000;
		System.out.println("Podaj liczbe z zakresu od 0 do "+a);
		boolean[] sito = new boolean[a];
		erasito(sito);
		int b =s.nextInt();
	
			if(sito[b]==true)	System.out.println(b + ":	jest liczb¹ pierwsz¹");
			else System.out.println(b + ":	nie jest liczb¹ pierwsz¹");
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
