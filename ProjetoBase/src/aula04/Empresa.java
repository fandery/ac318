package aula04;


public class Empresa {

    String nome;
    String cnpj;
    Departamento dpt;


    public Empresa(){
        dpt = new Departamento();
        //dpt.nome = "Departamento X";
        //dpt.nFuncionarios = 100;
    }

    public void mostraInfos(){
        System.out.println("Nome: " + nome);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Departamento: " + dpt.nome);
        System.out.println("Departamento - nFunc: " + dpt.nFuncionarios);
    }
    
}
