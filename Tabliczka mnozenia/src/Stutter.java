import java.util.Scanner;

public class Stutter 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Podaj tekst");
		String text= scanner.next();
		int a = text.length();
		System.out.println("Jak bardzo mam siê j¹kaæ?");
		int b=scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			char c=text.charAt(i);
			for(int j = 0;j<b;j++)
			{
				System.out.print(c);	
			}	
		}
		scanner.close();	
	}
}
