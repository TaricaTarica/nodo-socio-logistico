package entidades;

import java.util.List;

public class SocioLogistico {
	private String codigo;
	private String nombre;
	
	private List<Envio> envios;

	public SocioLogistico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SocioLogistico(String codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public SocioLogistico(String codigo, String nombre, List<Envio> envios) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.envios = envios;
	}
	

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Envio> getEnvios() {
		return envios;
	}

	public void setEnvios(List<Envio> envios) {
		this.envios = envios;
	}
	
}
