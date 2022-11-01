public class ContaBanco {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo = 0;

    public void inserirNumeroConta(int numeroConta){
        numero = numeroConta;
    }
    public void adicionarAgencia(String numeroAgencia){
        agencia = numeroAgencia;
    }
    public void nomeCompleto(String nome){
        nomeCliente = nome ;
    }
    public void depositoCliente(Float valorDeposito){
        saldo = valorDeposito;
    }
}
