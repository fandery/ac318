/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mariokart;

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

        System.out.println("Aula 04 - Exercício do MarioKart");

        Kart kart1 = new Kart();
        kart1.nome = "Standard";
        kart1.motor.cilindradas = "100";

        Piloto piloto1 = new Piloto();
        piloto1.nome = "Mario";
        piloto1.vilao = false;

        kart1.piloto = piloto1;

        Kart kart2 = new Kart();
        kart2.nome = "Egg1";

        Piloto piloto2 = new Piloto();
        piloto2.nome = "Piloto X";
        piloto2.vilao = true;

        kart2.piloto = piloto2;

        kart1.mostraInfos();
        kart2.mostraInfos();


        kart1.pular();
        kart1.fazerDrift();
        kart2.soltarTurbo();



    }
    
}
