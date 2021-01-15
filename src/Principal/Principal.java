package Principal;

import java.util.Scanner;

import Musica.Artista;
import Servicesimpl.ArtistaServiceImpl;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iniciarBusqueda();
	}

	public static void iniciarBusqueda() {
		ArtistaServiceImpl artistaServiceImpl = new ArtistaServiceImpl();
		Artista artistaConsultado = null;
		Scanner sn = new Scanner(System.in);
		System.out.println("Ingresa el número del artista que deseas consultar");
		System.out.println("1 - Muse");
		System.out.println("2 - Metallica");

		int idArtistaSeleccionado = sn.nextInt();
		sn.nextLine();

		switch (idArtistaSeleccionado) {
		case 1:
			artistaConsultado = artistaServiceImpl.consultarPorID(idArtistaSeleccionado);
			break;
		case 2:
			artistaConsultado = artistaServiceImpl.consultarPorID(idArtistaSeleccionado);
			break;

		default:
			System.err.println("No se encontaron registros en base a tu seleccion");
			break;
		}
	}

}
