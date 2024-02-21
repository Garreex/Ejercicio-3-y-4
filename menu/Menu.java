package menu;

public class Menu {

	// mensaje de inicio
	public static void mostrarMensajeInicial() {
		System.out.println(
				"Bienvenido a la tienda virtual\n\n" + "El programa simula una tienda que vende juegos, música y cine\n"
						+ "Solamente se pueden vender productos si aparecen disponibles en la tienda\n");
	}

	// mensaje de opciones del menú
	public static void mostrarOpcionesMenu() {
		System.out.println("\nSeleccione qué desea realizar:\n\n" + "\t1. Mostrar productos. (Listar productos)\n"
				+ "\t2. Comprar productos\n" + "\t3. Mostrar caja. (Importe total de la compra actual)\n"
				+ "\tSALIR --> Pulse cualquier otro número\n");
	}

	// mensaje de cierre
	public static void mostrarMensajeFin() {
		System.out.println("---- Gracias por usar este software. ----");
	}
}
