import java.util.Timer;
import java.util.TimerTask;


public class ControllerTrial implements controllerInterface{

	View view;
	Subject model;
	
	public ControllerTrial(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
		
	}
	
	public void assinar(){
		
		model.registerObserver(view);
		System.out.println("Assinatura feita com sucesso. Em instantes voce sera atualizado com o cardapio semanal.");
		view.desabilitarBotaoAssinar();
		view.habilitarBotaoCancelar();
		
		final Timer timerCancela = new Timer();
		timerCancela.schedule(new TimerTask() {
	        public void run() {
	        	cancelar();
	        }
	      }, 50000);
	}
	
	public void cancelar(){
		
		model.removeObserver(view);
		System.out.println("Assinatura cancelada. Caso queira retornar, favor clicar novamente para assinar o cardapio.");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoAssinar();		
	}
}
