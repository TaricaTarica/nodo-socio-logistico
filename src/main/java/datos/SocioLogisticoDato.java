package datos;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import entidades.Envio;
import entidades.SocioLogistico;

/**
 * Session Bean implementation class SocioLogisticoDato
 */
@Singleton
@LocalBean
public class SocioLogisticoDato implements SocioLogisticoDatoLocal {

	private List<SocioLogistico> sociosLogisticos = new ArrayList<>();
	
    public SocioLogisticoDato() {
        // TODO Auto-generated constructor stub
    	this.init();
    }
    
    @Override
    public SocioLogistico buscarSocioLogistico(String codigo) {
		SocioLogistico retorno = null;
    	for(SocioLogistico s: this.sociosLogisticos) {
			if(s.getCodigo().equals(codigo)) {
				retorno = s;
			}
		}
    	return retorno;
    }
	
    @Override
	public List<Envio> obtenerEnviosSocioLogistico(String codigo) {
		SocioLogistico socio = this.buscarSocioLogistico(codigo);
		List<Envio> retorno = new ArrayList<>();
		if(socio != null) {
			retorno = socio.getEnvios();
		}
		return retorno;
	}
	
	@Override
	public Envio obtenerEnvio(String codigoSocioLogistico, int codigoEnvio) {
		List<Envio> envios = this.obtenerEnviosSocioLogistico(codigoSocioLogistico);
		Envio retorno = null;
		if(!envios.isEmpty()) {
			for(Envio e: envios) {
				if(e.getCodigo() == codigoEnvio) {
					retorno = e;
				}
			}
		}
		return retorno;
	}
	
	@Override
	public List<SocioLogistico> obtenerSociosLogisticos(){
		return this.sociosLogisticos;
	}

	public void init() {
		SocioLogistico vacunaExpress = new SocioLogistico("VacX", "Vacuna Express");
		sociosLogisticos.add(vacunaExpress);
		
		SocioLogistico vacunasYa = new SocioLogistico("VacY", "Vacunas Ya");
		sociosLogisticos.add(vacunasYa);
	}
}
