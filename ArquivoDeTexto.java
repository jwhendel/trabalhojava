import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoDeTexto {
    public static void main(String[] args) {
        List<String[]> lista = new ArrayList<>();    
        try {
    
                FileReader fr = new FileReader("arquivo-desordenado.txt");
                BufferedReader br = new BufferedReader(fr);
    
                String str;
                while((str = br.readLine()) != null){
                    lista.add(str.split(";"));
                } 
                br.close();
    
         } catch(IOException e) {
               System.out.println("Arquivo não encontrado!");
         }
    
         lista.forEach(a -> System.out.println(Arrays.toString(a)));
        
    }
}