
public class Sumapoteg 
{
	public static void main(String[] args) 
	{
		double suma=0;
		for(int i = 1; i<=10; i+=1)
		{
			suma=suma+i*i;
			System.out.print(i+", ");	
		}
		System.out.println("");
		System.out.println(suma);
	}
}
