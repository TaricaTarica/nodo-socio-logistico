package datos;

import java.util.List;

import javax.ejb.Local;

import entidades.Envio;
import entidades.SocioLogistico;

@Local
public interface SocioLogisticoDatoLocal {
	
	public SocioLogistico buscarSocioLogistico(String codigo);
	
	public List<Envio> obtenerEnviosSocioLogistico(String codigo);
	
	public Envio obtenerEnvio(String codigoSocioLogistico, int codigoEnvio);
		
	public  List<SocioLogistico> obtenerSociosLogisticos();
}
