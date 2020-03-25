/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author fandery
 */
public class AnimalPet {
    
    String nome;
    String especie;
    String som;
    String comida;
    int idade;
    
    
    void comer(){
        System.out.println("Hora de comer");
    }
    
    void dormir(int horas){
        System.out.println("Hora de dormir " + horas + " hora(s)");
    }
            
    void movimentar(int metros){
        System.out.println("Hora de movimentar " + metros + " metro(s)");
    }
    
    void fazerBarulho(){
        System.out.println("Hora de fazer barulho");
    }
}
