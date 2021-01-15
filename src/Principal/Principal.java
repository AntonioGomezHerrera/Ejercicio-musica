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

		if (artistaConsultado != null) {
			System.out.println("======= Registro encontrado ========");
			System.out.println("Nombre: " + artistaConsultado.getNombre());
			System.out.println("Tipo de Artista: " + artistaConsultado.getTipoArtista());
			System.out.println("País: " + artistaConsultado.getPais());
			System.out.println("ALBUMS: \n");

			artistaConsultado.getAlbums().forEach(album -> {
				System.out.println("\tALBUM: \t" + album.getNombre());
				System.out.println("\tAÑO DE LANZAMIENTO: \t" + album.getAnio());
				System.out.println("\tCOPIAS VENDIDAS: \t" + album.getCopiasVendidas());
				System.out.println();

			});
		}
		
		System.out.println("¿Deseas realizar otra busqueda? Y/N ");
		String opcionSeleccionada = sn.nextLine();
		
		if (opcionSeleccionada.equals("Y") || opcionSeleccionada.equals("y")) {
			iniciarBusqueda();
		}
		
		sn.close();
		System.out.println("Gracias por usar nuestro buscador de artistas, te esperamos pronto!");
		System.exit(0);
	}

}
