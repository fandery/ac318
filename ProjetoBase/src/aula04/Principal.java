/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

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

        System.out.println("Aula 04");


        Empresa empresa = new Empresa();
        empresa.nome = "Empresa X";
        empresa.cnpj = "123123JSI";

        empresa.dpt.nome = "Departamento Y";
        empresa.dpt.nFuncionarios = 50;

        empresa.mostraInfos();




    }
    
}
