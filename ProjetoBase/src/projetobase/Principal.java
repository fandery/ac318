/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase;

/**
 *
 * @author fandery
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Conta conta = new Conta();
        conta.numero = 123;
        conta.saldo = 100;
        conta.limite = 100;

        Cliente cliente = new Cliente();
        cliente.nome = "Felipe";
        conta.cliente = cliente; // esta linha é importante

        conta.mostraInfos();



    }
    
}
