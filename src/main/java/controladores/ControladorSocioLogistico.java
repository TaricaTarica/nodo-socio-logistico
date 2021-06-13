package controladores;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import datatypes.DTEnvio;
import datatypes.Estado;
import datos.SocioLogisticoDatoLocal;
import entidades.Envio;
import entidades.SocioLogistico;

import java.util.List;

/**
 * Session Bean implementation class ControladorSocioLogistico
 */
@Stateless
@LocalBean
public class ControladorSocioLogistico implements ControladorSocioLogisticoLocal {
	
	@EJB
	private SocioLogisticoDatoLocal sldl;
	
    public ControladorSocioLogistico() {
        // TODO Auto-generated constructor stub
    }

    public void agregarEnvios(String codigoSocioLogistico, List<DTEnvio> envios) {
    	SocioLogistico socio = sldl.buscarSocioLogistico(codigoSocioLogistico);
    	if(socio != null) {
    		for(DTEnvio e: envios) {
    			e.setEstado(Estado.Procesado);
    			socio.getEnvios().add(new Envio(e));
    			//ENVIO AL COMPONENTE CENTRAL SOCIOLOGISTICO-ENVIONOMBRE- ESTADO
    		}
    	}
    }
    public void cambiarEstadoEnvios() {
    	List<SocioLogistico> socios = sldl.obtenerSociosLogisticos();
    	if(!socios.isEmpty()) {
    		for(SocioLogistico s: socios) {
    			for(Envio e: s.getEnvios()) {
    				if(!e.getEstado().equals(Estado.Entregado)) {
    					if(e.getEstado().equals(Estado.Procesado)) {
        					e.setEstado(Estado.Entransito);
        					//ENVIO AL COMPONENTE CENTRAL SOCIOLOGISTICO-ENVIONOMBRE- ESTADO
        				}
        				else {
        					e.setEstado(Estado.Procesado);
        					//ENVIO AL COMPONENTE CENTRAL SOCIOLOGISTICO-ENVIONOMBRE- ESTADO
        				}
    				}
    			}
    		}
    	}
    }
    
}
