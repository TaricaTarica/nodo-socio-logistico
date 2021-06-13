package datatypes;

import java.util.List;

import entidades.Envio;
import entidades.SocioLogistico;

public class DTSocioLogistico {
	private String codigo;
	private String nombre;
	
	private List<DTEnvio> envios;
	
	public DTSocioLogistico() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DTSocioLogistico(String codigo, String nombre, List<DTEnvio> envios) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.envios = envios;
	}
	public DTSocioLogistico(SocioLogistico socio) {
		this.codigo = socio.getCodigo();
		this.nombre = socio.getNombre();
		for(Envio e: socio.getEnvios()) {
			this.envios.add(new DTEnvio(e));
		}
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

	public List<DTEnvio> getEnvios() {
		return envios;
	}

	public void setEnvios(List<DTEnvio> envios) {
		this.envios = envios;
	}
	
	
	
	
}
