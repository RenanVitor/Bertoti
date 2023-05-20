import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Cliente> cliente = new LinkedList<>();
        Restaurante italiano = new Restaurante();

        Cliente Vicenzo = new Cliente();

        Vicenzo.setNome("Vicenzo");

        cliente.add(Vicenzo);

        Facade facade = new Facade();

        facade.abrirPortas(cliente, italiano);

        facade.fecharPortas(italiano, cliente);
    }
}
