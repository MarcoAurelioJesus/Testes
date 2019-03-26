import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

public class MinhaApp {
	
	public static void main(String[] args) {
		final long TEMPO = (1000); // atualiza o site a cada 1 minuto
        //****INICIA A TAREFA ELE VERIFICA A CADA UM MINUTO****//
        System.out.println("inicio");  
         Timer timer = null;  
         if (timer == null) {  
             timer = new Timer();  
             TimerTask tarefa = new TimerTask() {  
                 public void run() {  
                     try {  
                         System.out.println("Teste Agendador");  
                        //chamar metodo  
                     } catch (Exception e) {  
                         e.printStackTrace();  
                     }  
                 }  
             };  
             timer.scheduleAtFixedRate(tarefa, TEMPO, TEMPO);  
         }
         }

}
