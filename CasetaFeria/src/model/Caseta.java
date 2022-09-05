package model;

public class Caseta {

	private String datosLeidos;
	private String titulo;
	private String calle;
	private Integer numero;
	private Integer modulo;
	private String clase;
	private String entidad;
	private Integer id;
	private Integer idCalle;
	
	
	public Caseta(String titulo, String calle, int numero, int modulo, String clase, String entidad,
			int id, int idCalle) {
		super();
		this.titulo = titulo;
		this.calle = calle;
		this.numero = numero;
		this.modulo = modulo;
		this.clase = clase;
		this.entidad = entidad;
		this.id = id;
		this.idCalle = idCalle;
	}


	public String getDatosLeidos() {
		return datosLeidos;
	}


	public String getTitulo() {
		return titulo;
	}


	public String getCalle() {
		return calle;
	}


	public Integer getNumero() {
		return numero;
	}


	public Integer getModulo() {
		return modulo;
	}


	public String getClase() {
		return clase;
	}


	public String getEntidad() {
		return entidad;
	}


	public Integer getId() {
		return id;
	}


	public Integer getIdCalle() {
		return idCalle;
	}


	public void setDatosLeidos(String datosLeidos) {
		this.datosLeidos = datosLeidos;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public void setModulo(int modulo) {
		this.modulo = modulo;
	}


	public void setClase(String clase) {
		this.clase = clase;
	}


	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setIdCalle(int idCalle) {
		this.idCalle = idCalle;
	}


	@Override
	public String toString() {
		return "Caseta [titulo=" + titulo + ", calle=" + calle + ", numero=" + numero
				+ ", modulo=" + modulo + ", clase=" + clase + ", entidad=" + entidad + ", id=" + id + ", idCalle="
				+ idCalle + "]";
	}
	
	
	
	
}
