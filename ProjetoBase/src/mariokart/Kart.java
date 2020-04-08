
package mariokart;

public class Kart{
    String nome;
    Piloto piloto;
    Motor motor;


    public Kart(){
        motor = new Motor();
        motor.cilindradas = "50";
        motor.velocidadeMaxima = 100;
    }

    public void pular(){
        System.out.println("Pular");
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Cilindradas: " + motor.cilindradas);
    }

    public void soltarTurbo(){
        System.out.println("Soltar turbo");
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Cilindradas: " + motor.cilindradas);
    }

    public void fazerDrift(){
        System.out.println("Fazer drift");
        System.out.println("Piloto: " + piloto.nome);
        System.out.println("Cilindradas: " + motor.cilindradas);
    }

    public void mostraInfos(){
        System.out.println("Kart: " + nome);
        System.out.println("Piloto: " + piloto.nome);
        if(piloto.vilao){
            System.out.println("Piloto é vilão");
        }else{
            System.out.println("Piloto não é vilão");
        }

        System.out.println("Motor possui " + motor.cilindradas + " cilindradas" );
        System.out.println("Motor possui " + motor.velocidadeMaxima + " de velocidade máxima" );



    }

}