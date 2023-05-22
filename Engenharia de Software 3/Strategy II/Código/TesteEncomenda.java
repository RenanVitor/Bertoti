import java.util.Scanner;

public class TesteEncomenda {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite aqui o numero do seu pedido: ");
		
		int numeroPedido = scanner.nextInt();
		
		Scanner scannerString = new Scanner(System.in);
		
		System.out.print("Produto(s) da ordem de compra: ");
		
		String produtoPedido = scannerString.nextLine();
		
		String Mensagem = String.format("De acordo com o frete solicitado no momento da compra, o pedido %d (%s) possui os seguintes prazos de entrega:", numeroPedido, produtoPedido);
		
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
