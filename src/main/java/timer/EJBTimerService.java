package timer;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import soap.DtEnvio;
import soap.EnviosSOAP;
import soap.EnviosSOAPService;

import java.util.List;

import javax.annotation.Resource;

/**
 * Session Bean implementation class EJBTimerService
 */
@Stateless
public class EJBTimerService {

	@Resource
	TimerService timerService;
	
	
	EnviosSOAP envioSOAP = new EnviosSOAPService().getEnviosSOAPPort();
	
		
    public EJBTimerService() {
    
    }
    
    public void setTimer(long interval) {
    	timerService.createTimer(interval, "Seteando timer");
    }
    
    @Schedule(second="*", minute="*/3", hour="0-23", dayOfWeek="*", month="*", year="*", info="TimerSocioLogistico")
    private void getEnvios(final Timer t) {

    	List<DtEnvio> envios1 = envioSOAP.obtenerEnviosPendientesSocioLogistico("cod01");
    	List<DtEnvio> envios2 = envioSOAP.obtenerEnviosPendientesSocioLogistico("cod02");
    	System.out.println("Lista creada");
    	try {
			Thread.sleep(60000);
	    	for(DtEnvio e: envios1) {
	    		envioSOAP.cambiarEstadoEnvio("cod01", "Entransito", e.getId());
	    	}
	    	for(DtEnvio e: envios2) {
	    		envioSOAP.cambiarEstadoEnvio("cod02", "Entransito", e.getId());
	    	}
	    	System.out.println("entransito");
	    	Thread.sleep(60000);
	    	for(DtEnvio e: envios1) {
	    		envioSOAP.cambiarEstadoEnvio("cod01", "Entregado", e.getId());
	    	}
	    	for(DtEnvio e: envios2) {
	    		envioSOAP.cambiarEstadoEnvio("cod02", "Entregado", e.getId());
	    	}
	    	System.out.println("entregado");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    }

}
