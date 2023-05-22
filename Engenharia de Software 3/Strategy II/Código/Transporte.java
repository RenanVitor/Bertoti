
public class Transporte {

	private Frete entrega;
	
	public void setEntrega(Frete entrega) {
		this.entrega = entrega;
	}
	
	public void efetuarEntrega() {
		this.entrega.entregar();
	}
	
}
