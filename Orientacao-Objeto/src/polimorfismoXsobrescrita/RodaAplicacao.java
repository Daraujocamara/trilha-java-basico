package polimorfismoXsobrescrita;

public class RodaAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(); // estanciando objeto na classe Funcionario
        //upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Gerente gerente_ = new Funcionario();
            //donwcast
            Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
