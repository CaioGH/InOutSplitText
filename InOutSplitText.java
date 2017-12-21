/*

Autor: Caio Souza.
Questão: 3.

AVISO: FAVOR ESPECIFICAR O DIRETÓRIO DOS ARQUIVOS.

*/



package splittext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SplitText
    {

    public static void main(String[] args) throws FileNotFoundException, IOException
        {
       
         
    ArrayList FullFile = new ArrayList (); //Array para receber o arquivo completo.
    ArrayList Text = new ArrayList (); //Array Auxiliar.


        try
          {
            String Txt = "C:\\Users\\caios\\Desktop\\in.txt"; //Diretório Local.
            FileReader txtFile = new FileReader (new File (Txt));
            BufferedReader readTxt = new BufferedReader (txtFile);
            String FileContent;

            while ((FileContent = readTxt.readLine ()) != null)
              {
                FullFile.add (FileContent);
              }

            FullFile.remove (0); //Remover A primeira linha -> "15"
            readTxt.close (); //Fim da leitura.

            Text = (ArrayList) FullFile.clone (); //Cópia do array.

            //Variáveis para realizar o SPLIT.
            String TextContent = Text.toString (); 
            String[] textPart;
            
            //Realizando o Split.
            Text.toString ();
            textPart = TextContent.split (" ");

            //Criando o arquivo out.txt.
            FileWriter arq = new FileWriter ("C:\\Users\\caios\\Desktop\\out.txt"); 
            PrintWriter writer = new PrintWriter (arq);

            //Salvando as informações no txt.
            writer.println  (String.format(TextContent.substring (1, 6) + " " + textPart[1] 
            + "%n" + textPart[2] + " " + textPart[3] + " " + textPart[4] + "%n"
            + textPart[5] + "%n" + textPart[6] + "%n" + textPart[7] + " " 
            + textPart[8] + "%n" + textPart[9] + " " + textPart[10] + " " 
            + textPart[11] + "%n" + textPart[12] + "%n" + textPart[13] + " "
            + textPart[14] + "%n"  + textPart[15] + " " + textPart[16] + "%n" 
            + textPart[17] + " " + textPart[18] + "%n" + textPart[19] + " " 
            + textPart[20] + "%n"  + textPart[21] + " " + textPart[22] + "%n"
            + TextContent.substring(161,167)));

            writer.flush ();

          }
        
        catch (IOException e)
          {
            System.err.printf ("Erro na abertura do arquivo. Por favor, confira"
                               + " o diretório. %s.\n", e.getMessage ());
          }

        }

         
         
        }
    
    


    