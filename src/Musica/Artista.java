package Musica;

import java.util.List;

public class Artista {
	
	private int id;
	private String nombre;
	private List<Album> albums;
	private String tipoArtista;
	private String pais;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the albums
	 */
	public List<Album> getAlbums() {
		return albums;
	}
	/**
	 * @param albums the albums to set
	 */
	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	/**
	 * @return the tipoArtista
	 */
	public String getTipoArtista() {
		return tipoArtista;
	}
	/**
	 * @param tipoArtista the tipoArtista to set
	 */
	public void setTipoArtista(String tipoArtista) {
		this.tipoArtista = tipoArtista;
	}
	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	
}
