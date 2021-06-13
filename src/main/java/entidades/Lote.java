package entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import datatypes.DTLote;

public class Lote {
	private String nombre;
	private int cantVacunas;
	private LocalDate fechaCreado;
	
	private long vacuna;

	public Lote() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lote(String nombre, int cantVacunas, LocalDate fechaCreado, long vacuna) {
		super();
		this.nombre = nombre;
		this.cantVacunas = cantVacunas;
		this.fechaCreado = fechaCreado;
		this.vacuna = vacuna;
	}
	
	public Lote(DTLote lote) {
		this.nombre = lote.getNombre();
		this.cantVacunas = lote.getCantVacunas();
		this.fechaCreado = LocalDate.parse(lote.getFechaCreado(),  DateTimeFormatter.ofPattern("d/MM/yyyy"));
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

	public LocalDate getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(LocalDate fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public long getVacuna() {
		return vacuna;
	}

	public void setVacuna(long vacuna) {
		this.vacuna = vacuna;
	}

	
}
