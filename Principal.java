import java.util.Scanner;
public class Principal{
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		int dato;

		System.out.print("Ingrese numero: ");
		dato = read.nextInt();

		if ((dato % 2)==0 ) {
			System.out.println("Numero par");
		} else {
			System.out.println("NUmero impar");
		}


		

	}
}