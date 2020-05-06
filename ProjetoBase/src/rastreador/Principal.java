/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rastreador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author fandery
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Aula 06 - Resolução de exercícios");

        System.out.println("Leitura do arquivo");

        int contGEC = 0, contGEB = 0, contGET = 0, contGEA = 0;

        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o email do aluno: ");
        String email = teclado.next();
        boolean emailExists = false;


        InputStream is = new FileInputStream("arquivos/emails.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        while(s != null){
            System.out.println(s);

            if(s.contains("@gec")){               
               contGEC = contGEC + 1; 
            }else if(s.contains("@geb")){
                contGEB = contGEB + 1;
            }else if(s.contains("@get")){
                contGET = contGET + 1;
            }else if(s.contains("@gea")){
                contGEA = contGEA + 1;
            }

            if(s.contains(email)){
                emailExists = true;
            }

            s = br.readLine();
        }

        System.out.println("Número de alunos por curso");
        System.out.println("Alunos computacao: " + contGEC);
        System.out.println("Alunos biomedica: " + contGEB);
        System.out.println("Alunos telecom: " + contGET);
        System.out.println("Alunos automacao: " + contGEA);
        
        if(emailExists){
            System.out.println("O email do aluno foi encontrado");
        }else{
            System.out.println("O email do aluno não foi encontrado no arquivo");
        }




    }
    
}
