package datatypes;

import entidades.Lote;

public class DTLote {
	private String nombre;
	private int cantVacunas;
	private String fechaCreado;
	
	private long vacuna;
	
	public DTLote() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DTLote(String nombre, int cantVacunas, String fechaCreado, long vacuna) {
		super();
		this.nombre = nombre;
		this.cantVacunas = cantVacunas;
		this.fechaCreado = fechaCreado;
		this.vacuna = vacuna;
	}

	public DTLote(Lote lote) {
		this.nombre = lote.getNombre();
		this.cantVacunas = lote.getCantVacunas();
		this.fechaCreado = lote.getFechaCreado().toString();
		this.vacuna = lote.getVacuna();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantVacunas() {
		return cantVacunas;
	}

	public void setCantVacunas(int cantVacunas) {
		this.cantVacunas = cantVacunas;
	}

	public String getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(String fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public long getVacuna() {
		return vacuna;
	}

	public void setVacuna(long vacuna) {
		this.vacuna = vacuna;
	}
	
}
