import java.util.Scanner;

public class DodawanieString 
{
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int rozmiar;
		
		String liczba1=s.nextLine();
		String liczba2=s.nextLine();
		
		int r1 = liczba1.length();
		int r2 = liczba2.length();
		
		if(r1>r2) rozmiar= r1;
		else rozmiar= r2;

		byte[] a = new byte[rozmiar];
		byte[] b = new byte[rozmiar];
		byte[] c = new byte[rozmiar + 1];
		for(int i=0;i<rozmiar;i++)
		{
			a[i]=b[i]=0;
		}
		for(int i=0;i<r1;i++)
		{
			char znak=liczba1.charAt(r1-i-1);
			String cyfra = Character.toString(znak);
			a[i]=Byte.parseByte(cyfra);
		}
		for(int i=0;i<r2;i++)
		{
			char znak=liczba2.charAt(r2-i-1);
			String cyfra = Character.toString(znak);
			b[i]=Byte.parseByte(cyfra);
		}
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
}

