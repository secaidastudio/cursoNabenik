
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args) {
		System.out.println("OSCAR PAIZ!!");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		Scanner read = new Scanner (System.in);
		int dato;

		System.out.print("Ingrese numero: ");
		dato = read.nextInt();

		if ((dato % 2)==0 ) {
			System.out.println("Numero par");
		} else {
			System.out.println("NUmero impar");
		}

				System.out.println("ahora estoy en la nueva_rama");

		System.out.println("Hola mundo!!!!");

		Principal coca = new Principal();
		coca.prueba();

	}

	public static void prueba(){
		System.out.println("Hola todos1!!!!");
	}
}