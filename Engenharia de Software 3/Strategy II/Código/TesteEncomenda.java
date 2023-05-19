import java.util.Scanner;

public class TesteEncomenda {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite aqui o numero do seu pedido: ");
		
		int numero = scanner.nextInt();
		
		String Mensagem = String.format("De acordo com o frete solicitado, o pedido %d possui os seguintes prazos de entrega:", numero);
		
		System.out.println(Mensagem);
		
		Transporte eletronico = new Transporte();
		
		System.out.println("-------------------------------------");
		
		eletronico.setEntrega(new FreteComum());
		eletronico.efetuarEntrega();
	
		System.out.println("-------------------------------------");
	
		eletronico.setEntrega(new FreteRapido());
		eletronico.efetuarEntrega();
		
		System.out.println("-------------------------------------");
	
		eletronico.setEntrega(new FreteLoja());
		eletronico.efetuarEntrega();
	}
	
}
