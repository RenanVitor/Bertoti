
public class App {
	public static void main(String[] args) {
		Esquadrao esq1 = new Esquadrao();
		
		esq1.add(new Soldado("Renan","Soldado de Primeira Classe"));
		esq1.add(new Marinheiro("Fernando", "Marinheiro de Esquadra"));
		
		String ordem = "Movimentar para a posicao designada!";
		esq1.executarOrdem(ordem);
	}
}
