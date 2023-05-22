public class Controller implements controllerInterface{

	View view;
	Subject model;
	
	public Controller(Subject mo){
		this.model = mo;
		view = new View(model, this);
		view.createView();
		view.desabilitarBotaoCancelar();
		
	}
	
	public void assinar(){
		
		model.registerObserver(view);
		System.out.println("Cadastro feito com sucesso. Em breve você sera atualizado com o cardapio diario a ser servido em nosso restaurante.");
		view.desabilitarBotaoAssinar();
		view.habilitarBotaoCancelar();
		
	}
	
	public void cancelar(){
		
		model.removeObserver(view);
		System.out.println("Cadastro suspenso. Nao hesite em ativar o cadastro para continuar recebendo as atualizacoes do cardapio.");
		view.desabilitarBotaoCancelar();
		view.habilitarBotaoAssinar();
		
	}
	
}
