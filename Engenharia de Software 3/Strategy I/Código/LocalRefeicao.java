
public class LocalRefeicao {
    private TipoRefeicao tipoRefeicao;
   	public void setTipo (TipoRefeicao jantar) {
		tipoRefeicao = jantar;
	}
	
	public void definirRefeicao() {
		tipoRefeicao.consumirRefeicao();
	}
}
