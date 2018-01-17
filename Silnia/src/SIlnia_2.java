import java.util.Scanner;

public class SIlnia_2 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Któr¹ czêœæ ci¹gu chcesz? ");
		int a = s.nextInt();
		Sil(a);
		System.out.print(Sil(a));
	}
	public static int Sil(int ktory)
	{
		if(ktory==0) return 1;
		if(ktory==1) return 1;
		if(ktory>1) return Sil(ktory-1)*ktory;
		return 0;
	}
	
}
