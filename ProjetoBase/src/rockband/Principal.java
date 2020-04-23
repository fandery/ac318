/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockband;

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
        System.out.println("AULA 05 - Coleções - Resolução de exercício");

        //Banda banda = new Banda();
        BandaList banda = new BandaList();

        banda.nome = "RockBand";
        banda.genero = "rock";

        Empresario empresario = new Empresario();
        empresario.cnpj = 12312344;
        empresario.nome = "Empresario 1";

        banda.empresario = empresario;
        
        Musico musico1 = new Musico();
        musico1.nome = "Musico 1";
        musico1.funcao = "Baterista";

        Musico musico2 = new Musico();
        musico2.nome = "Musico 2";
        musico2.funcao = "Vocalista";

        banda.addMusico(musico1);
        banda.addMusico(musico2);

        Musica musica1 = new Musica();
        musica1.nome = "Musica 1";
        musica1.tempo = 100;

        Musica musica2 = new Musica();
        musica2.nome = "Musica 2";
        musica2.tempo = 50;

        banda.addMusica(musica1);
        banda.addMusica(musica2);

        banda.mostraInfosBanda();

        
    }
    
}
