
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
	public void setMeals(String diaSemana, String pratoEntrada, String pratoPrincipal, String pratoSobremesa);
}
