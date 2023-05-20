import java.util.LinkedList;

public class Facade {
    public void abrirPortas(LinkedList<Cliente> cliente, Restaurante italiano) {
        italiano.abrir();
        cliente.forEach(a -> a.entrar());
    }
    public void fecharPortas(Restaurante italiano, LinkedList<Cliente> cliente) {
    	cliente.forEach(a -> a.sair());
        italiano.fechar();
    }
}