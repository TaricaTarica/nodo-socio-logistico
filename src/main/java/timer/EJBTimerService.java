package timer;

import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.ejb.Timer;
import javax.ejb.TimerService;

import javax.annotation.Resource;

/**
 * Session Bean implementation class EJBTimerService
 */
@Stateless
public class EJBTimerService {

	@Resource
	TimerService timerService;
		
    public EJBTimerService() {
    
    }
    
    public void setTimer(long interval) {
    	timerService.createTimer(interval, "Seteando timer");
    }
    
    @Schedule(second="*/10", minute="*", hour="0-23", dayOfWeek="*", month="*", year="*", info="TimerSocioLogistico")
    private void getEnvios(final Timer t) {
    	System.out.println("FUNCIONA EL TIMER!");
    	
    	//Aca llamo al loco que me trae las listas de envios
    	//aca ejecuto la funcion que agrega esas listas a mis SociosLogisticos
    	//aca cambio los estados (agregar alguna sleep en el medio)
    }

}
