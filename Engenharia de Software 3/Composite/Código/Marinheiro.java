
public class Marinheiro implements Militar {
	private String nome;
	private String patente;
	
	public Marinheiro(String nome, String patente) {
		this.nome = nome;
		this.patente = patente;
	}
	
	public void executarOrdem(String ordem) {
		System.out.println(String.format("Ordem \"%s\" executada por %s/%s.", ordem, nome, patente));
	}

}
