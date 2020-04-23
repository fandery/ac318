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
        System.out.println("AULA 05 - Coleções");

        int n = 10;

        int [] idades;

        idades = new int[n];

        idades[5] = 28;

        System.out.println("O valor da idade na posicao 0 é: " + idades[0]);
        System.out.println("O valor da idade na posicao 5 é: " + idades[5]);


        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.numero = "12345";
        conta1.saldo = 1000;

        conta2.numero = "67890";
        conta2.saldo = 50;

        conta3.numero = "33333";
        conta3.saldo = 3000;

        Conta [] minhasContas = new Conta [10];

        minhasContas[0] = conta1;
        minhasContas[1] = conta2;
        minhasContas[5] = conta3;

        //System.out.println("Saldo da conta 1 é: " + minhasContas[0].saldo);
        //System.out.println("Número da conta 1 é: " + minhasContas[0].numero);

        //System.out.println("Saldo da conta 2 é: " + minhasContas[1].saldo);

        //FORMA 1
        System.out.println("FORMA 1");
        for (int i=0; i < minhasContas.length; i++){
            if(minhasContas[i] != null){
                System.out.println("Saldo da conta " + i + " é: " + minhasContas[i].saldo);
                System.out.println("Número da conta " + i + " é: " + minhasContas[i].numero);
            }
        }

        //FORMA 2
        System.out.println("FORMA 2");
        for (Conta c: minhasContas){
            if(c != null){
                System.out.println("Saldo da conta é: " + c.saldo);
                System.out.println("Número da conta é: " + c.numero);
            }
        }









    }
    
}
