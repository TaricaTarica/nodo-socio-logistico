package datatypes;

import entidades.Envio;

public class DTEnvio {
	private int codigo;
	private String vacunatorio;
	private Estado estado;
	private DTLote lote;
	
	public DTEnvio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DTEnvio(int codigo, String vacunatorio, Estado estado, DTLote lote) {
		super();
		this.codigo = codigo;
		this.vacunatorio = vacunatorio;
		this.estado = estado;
		this.lote = lote;
	}
	
	public DTEnvio(Envio envio) {
		this.codigo = envio.getCodigo();
		this.vacunatorio = envio.getVacunatorio();
		this.estado = envio.getEstado();
		this.lote = new DTLote( envio.getLote());
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

	public DTLote getLote() {
		return lote;
	}

	public void setLote(DTLote lote) {
		this.lote = lote;
	}
	
}
