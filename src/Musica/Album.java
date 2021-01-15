package Musica;

public class Album {
	
	private int id;
	private String nombre;
	private int anio;
	private long copiasVendidas;
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
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the copiasVendidas
	 */
	public long getCopiasVendidas() {
		return copiasVendidas;
	}
	/**
	 * @param copiasVendidas the copiasVendidas to set
	 */
	public void setCopiasVendidas(long copiasVendidas) {
		this.copiasVendidas = copiasVendidas;
	}
}
