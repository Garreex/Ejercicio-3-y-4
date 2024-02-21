package app;

//Aquí importamos las clases Leer y Menu de otros paquetes
import leer.Leer;
import menu.Menu;

public class Aplicacion {

	public static void main(String[] args) {

		// esto hace coger la funcion mostrarMensajeInicial() de la clase Menu.
		Menu.mostrarMensajeInicial();

		boolean continuar = true;

		do {
			// esto hace coger la funcion mostrarOpcionesMenu() de la clase Menu.
			Menu.mostrarOpcionesMenu();

			// aquí coge el dato int entre 1 y 3 de la clase Leer, y si es diferente a
			// estos, para el programa
			switch (Leer.datoInt()) {
			case 1:
				// Falta por rellenar
				break;
			case 2:
				// Falta por rellenar
				break;
			case 3:
				// Falta por rellenar
				break;
			default:
				continuar = false;
				break;
			}

		} while (continuar);

		// esto hace coger la funcion mostrarMensajeFin() de la clase Menu.
		Menu.mostrarMensajeFin();
	}
}