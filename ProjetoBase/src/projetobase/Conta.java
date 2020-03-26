package projetobase;


public class Conta {

    int numero;
    float saldo;
    float limite;
    Cliente cliente;


    public void mostraInfos(){
        System.out.println("Numero: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Cliente: " + cliente.nome);
    }
    
    
}
