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
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalPet pet1 = new AnimalPet();
        pet1.comida = "racao";
        pet1.nome = "Bob";
        pet1.som = "au au";
        pet1.idade = 10;
        pet1.especie = "vira lata";
        
        pet1.comer();
        pet1.dormir(1);
        
        AnimalPet pet2 = new AnimalPet();
        pet2.idade = 2;
        
        pet2.fazerBarulho();
        pet2.movimentar(2);
        
    }
    
}
