package entidades;

import datatypes.DTEnvio;
import datatypes.Estado;

public class Envio {
	private int codigo;
	private String vacunatorio;
	private Estado estado;
	private Lote lote;
	
	public Envio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Envio(int codigo, String vacunatorio, Estado estado, Lote lote) {
		super();
		this.codigo = codigo;
		this.vacunatorio = vacunatorio;
		this.estado = estado;
		this.lote = lote;
	}
	
	public Envio(DTEnvio envio) {
		this.codigo = envio.getCodigo();
		this.vacunatorio = envio.getVacunatorio();
		this.estado = envio.getEstado();
		this.lote = new Lote(envio.getLote());
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getVacunatorio() {
		return vacunatorio;
	}

	public void setVacunatorio(String vacunatorio) {
		this.vacunatorio = vacunatorio;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	
}
