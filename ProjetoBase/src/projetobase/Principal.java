/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetobase;

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
        System.out.println("Aula 06 - Pacote Java.io");

        System.out.println("Leitura do arquivo");

        InputStream is = new FileInputStream("arquivos/arquivo.txt");
        //int b = is.read();
        //System.out.println("Valor de b: " + b);
        //System.out.printf("Valor do caracter: %c\n", b);

        InputStreamReader isr = new InputStreamReader(is);
        //int c = isr.read();
        //System.out.println("Valor de c: " + c);
        //System.out.printf("Valor do caracter: %c\n", c);

        BufferedReader br = new BufferedReader(isr);

        String s = br.readLine();

        while(s != null){
            System.out.println(s);
            s = br.readLine();
        }

        System.out.println("Escrita no arquivo");

        OutputStream os = new FileOutputStream("arquivos/escrita.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Aula de java\n");
        bw.write("Escrita no arquivo - pacote javaio");

        bw.close();

    }
    
}
