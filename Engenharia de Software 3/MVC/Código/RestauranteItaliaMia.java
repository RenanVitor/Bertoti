import java.util.*;

public class RestauranteItaliaMia {

	public static void main(String[] args) {
		final Model model = new Model();
		ControllerTrial controller = new ControllerTrial(model);
		
		
		final Timer timer = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeals("Segunda-Feira (22/05)", "Antepasto de berinjela à italiana", "Bistecca alla Fiorentina", "Panna Cotta com Geleia de Damasco");
	        }
	      }, 10000);
	      
	      final Timer timer2 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeals("Terca-Feira (23/05)", "Sopa de legumes à italiana", "Cotoletta alla milanese", "Tiramisù Italiano");
	        }
	      }, 15000);
	      
	      final Timer timer3 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeals("Quarta-Feira (24/05)", "Salada Caprese", "Trippa alla Romana", "Babà al Rum");
	        }
	      }, 20000);
	      
	      final Timer timer4 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeals("Quinta-Feira (25/05)", "Salada Caesar", "Lasagna à Bolonhesa", "Crostata de ricota");
	        }
	      }, 30000);
	      
	      final Timer timer5 = new Timer();
	      timer.schedule(new TimerTask() {
	        public void run() {
	        	model.setMeals("Sexta-Feira (26/05)", "Paninis com queijo de cabra e tomates grelhados", "Costela de vitela a milanesa com risoto de limao siciliano", "Torta de ricota napolitana");
	        }
	      }, 40000);
	}
}
