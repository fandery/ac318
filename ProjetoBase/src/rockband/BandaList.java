
package rockband;

import java.util.ArrayList;
import java.util.List;

public class BandaList {

    String nome;
    String genero;
    
    List<Musico> musicos = new ArrayList<>();    
    List<Musica> musicas = new ArrayList<>();    
    
    Empresario empresario;


    void addMusico(Musico musico){
        musicos.add(musico);
    }

    void addMusica(Musica musica){
        musicas.add(musica);
    }

    void mostraInfosBanda(){
        System.out.println("Infos banda");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Músicos");
        for(Musico m: musicos){
            System.out.println("Nome: " + m.nome);
            System.out.println("Funcao: " + m.funcao);
            
        }

        System.out.println("Músicas");
        for(Musica m: musicas){
            System.out.println("Nome: " + m.nome);
            System.out.println("Funcao: " + m.tempo);
        }

        if (empresario != null){
            System.out.println("Empresario");
            System.out.println("CNPJ: " + empresario.cnpj);
            System.out.println("Nome: " + empresario.nome);
        }else{
            System.out.println("A banda nao possui empresario");
        }

    }

}