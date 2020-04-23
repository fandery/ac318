
package rockband;

public class Banda{

    String nome;
    String genero;
    int n = 1;
    Musico[] musicos = new Musico[n];
    Musica[] musicas = new Musica[n];
    Empresario empresario;

    int contMusicos = 0;
    int contMusicas = 0;

    void addMusico(Musico musico){
        if(contMusicos < n){
            musicos[contMusicos] = musico;
            contMusicos = contMusicos + 1;
        }else{
            System.out.println("O array de musicos esta cheio!");
        }
    }

    void addMusica(Musica musica){
        if(contMusicas < n){
            musicas[contMusicas] = musica;
            contMusicas = contMusicas + 1;
        }else{
            System.out.println("O array de musicas esta cheio!");
        }
    }

    void mostraInfosBanda(){
        System.out.println("Infos banda");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Músicos");
        for(Musico m: musicos){
            if (m != null){
                System.out.println("Nome: " + m.nome);
                System.out.println("Funcao: " + m.funcao);
            }
        }

        System.out.println("Músicas");
        for(Musica m: musicas){
            if (m != null){
                System.out.println("Nome: " + m.nome);
                System.out.println("Funcao: " + m.tempo);
            }
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