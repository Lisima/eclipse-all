
public class Pierwiastki {

	public static void main(String[] args) 
	{
		double suma=2;
		for(int i = 2; i<=10; i++)
		{
			suma=suma+i/Math.sqrt(i+1);
			System.out.print(i+", ");	
		}
		System.out.println("");
		System.out.println(suma);
	}

}
