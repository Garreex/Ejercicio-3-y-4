package leer;

/**
 * 
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Antonio
 *
 */
public class Leer {

	public static String dato() {
		String sdato = " ";
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader flujoE = new BufferedReader(isr);
			sdato = flujoE.readLine();
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		}
		return sdato;

	}

	// Aquí lo que hace es leer un Int siendo este entre 1 y 3 en la primera parte
	// del programa para seleccionar uno de los ''menús''

	public static int datoInt() {
		return Integer.parseInt(dato());
	}

	// Aquí lo que hace es leer un Float (que podría ser un int siendo este entre 1
	// y 3 en la segunda parte del programa para seleccionar uno de los ''submenús''

	public static float datoFloat() {
		return Float.parseFloat(dato());
	}

	// Leer un char por teclado

	public static char datoChar() {
		char c = ' ';
		try {
			java.io.BufferedInputStream b = new BufferedInputStream(System.in);
			c = (char) b.read();
		} catch (IOException e) {
			System.out.println("Error al leer");
			e.printStackTrace();
		}
		return c;
	}

	// Aquí lo que hace es leer un Long para dar un importe
	public static long datoLong() {
		return Long.parseLong(dato());
	}

}
