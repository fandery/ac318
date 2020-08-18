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
        
        System.out.println("Olá Turma");
        System.out.println("AC318");

        // Este é um comentário em Java
        
        /* 
            Este é um outro comentário
            Este é um outro comentário
            Este é um outro comentário
        */

        int numero = 0;
        float numero_real = (float) 1.10;
        double numero_real_2 = 2.0;
        char character = 'a';

        String minhaString = "Vou guardar um texto nesta variável";

       System.out.println("Minha String original " + minhaString); 

       System.out.println("Minha String " + minhaString.toUpperCase());

       System.out.println("Minha String " + minhaString.toLowerCase());

       System.out.println("QTD caracteres: " + minhaString.length());

       //#####################################################################
       int ano1 = 560, ano2 = 670, ano3 =  540;

       int soma = ano1 + ano2 + ano3;

       double media = soma / 3;
       
       //SOMA
       System.out.println("A soma é: " + soma);

       //MEDIA
       System.out.println("A média é: " + media);

       



    }
    
}
