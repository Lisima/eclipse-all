
public class Potegi2 {

	public static void main(String[] args) 
	{
		int suma=0;
		int mnoznik=1;
		for(int i=1;i<100; i*=2)
		{
			suma=suma+i*mnoznik;
			System.out.print(i+", ");
			mnoznik=mnoznik*-1;
			System.out.print("mnoznik: "+mnoznik);
			System.out.println(" suma; " +suma);
		}
		System.out.println("");
		System.out.println("Suma: "+suma);

	}
}