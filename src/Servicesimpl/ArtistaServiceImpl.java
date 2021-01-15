package Servicesimpl;

import java.lang.reflect.Array;
import java.util.ArrayList;

import Musica.Album;
import Musica.Artista;
import Services.ArtistaService;

public class ArtistaServiceImpl implements ArtistaService {

	@Override
	public Artista consultarPorID(int idArtista) {
		// TODO Auto-generated method stub
		Artista artista = new Artista();
		ArrayList<Album> albums = new ArrayList<Album>();
		
		if (idArtista == 1) {
			artista.setId(1);
			artista.setNombre("Muse");
			artista.setPais("Gran Bretaña");
			artista.setTipoArtista("Grupo");
			
			Album albumSimulation = new Album();
			albumSimulation.setId(2);
			albumSimulation.setNombre("Simulation Theory");
			albumSimulation.setAnio(2018);
			albumSimulation.setCopiasVendidas(900000);
			
			Album albumDrones = new Album();
			albumDrones.setId(1);
			albumDrones.setNombre("Drones");
			albumDrones.setAnio(2015);
			albumDrones.setCopiasVendidas(15000000);
			
			albums.add(albumDrones);
			albums.add(albumSimulation);
			
			artista.setAlbums(albums);
		}
		
		if (idArtista == 2) {
			artista.setId(2);
			artista.setNombre("Metallica");
			artista.setPais("Estados Unidos");
			artista.setTipoArtista("Grupo");
			
			Album albumSimulation = new Album();
			albumSimulation.setId(3);
			albumSimulation.setNombre("Master of Puppets");
			albumSimulation.setAnio(1986);
			albumSimulation.setCopiasVendidas(100000000);
			
			Album albumDrones = new Album();
			albumDrones.setId(4);
			albumDrones.setNombre("Hardwired...to Self-Destruct");
			albumDrones.setAnio(2016);
			albumDrones.setCopiasVendidas(800000000);
			
			albums.add(albumDrones);
			albums.add(albumSimulation);
			
			artista.setAlbums(albums);
		}
		return artista;
	}
	
}
