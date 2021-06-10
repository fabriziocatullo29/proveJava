import java.util.Scanner;

public class GestoreIO {
	
	public static double leggiDecimale(String messaggio) {
		System.out.println(messaggio);
		return Double.parseDouble(new Scanner(System.in).nextLine());
	}

}
