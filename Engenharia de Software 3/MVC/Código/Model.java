import java.util.ArrayList;

public class Model implements Subject {
    private ArrayList<Observer> observers;
    private String diaSemana;
    private String pratoPrincipal;
    private String pratoEntrada;
    private String pratoSobremesa;

    public Model() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(diaSemana,pratoEntrada, pratoPrincipal, pratoSobremesa);
        }
    }

    public void setMeals(String diaSemana, String pratoEntrada, String pratoPrincipal, String pratoSobremesa) {
    	this.diaSemana = diaSemana;
        this.pratoEntrada = pratoEntrada;
        this.pratoPrincipal = pratoPrincipal;
        this.pratoSobremesa = pratoSobremesa;
        notifyObservers();
    }
    
    public String getdiaSemana() {
		return diaSemana;
	}
    
    public String getpratoEntrada() {
		return pratoEntrada;
	}
	
	public String getpratoPrincipal() {
		return pratoPrincipal;
	}
	
	public String getpratoSobremesa() {
		return pratoSobremesa;
	}
}
