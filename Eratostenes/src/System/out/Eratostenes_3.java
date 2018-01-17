package System.out;

import java.util.Scanner;

public class Eratostenes_3 {
	static int b;
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{


		int a =1000;

		boolean[] sito = new boolean[a];
		erasito(sito);
		do {
			System.out.println("Podaj liczbe z zakresu od 0 do "+a);
			b =s.nextInt();
			if(b>0 && b<1000){
				if(sito[b]==true)	System.out.println("tak");
				else System.out.println("nie");
			}
			if(b>1000)System.out.println(b+"	Jest wiêksze od Tysi¹ca. B³¹d");
			
			if(b<0)System.out.println(b+"	Nie jest wiêksze od zera. B³¹d");

			if(b==0)System.out.println("koniec");
		}while(b!=0);
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
