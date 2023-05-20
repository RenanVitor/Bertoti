public class Cliente {
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void entrar(){
        System.out.println(nome.toString() + " chegou e necessita de uma mesa.");
    }

    public  void sair(){
        System.out.println(nome.toString() + " foi embora. Favor, direcionar o proximo cliente para a mesa vaga.");
    }
}
