package pkg0816_heranca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class TestaAnimais 
{
    public static void main(String[] args) 
    {
        String[] Menu = {"Inserir Animal", "Listar Animal", "Eliminar Animal", "Exportar", "Importar", "Sair"};
        
        int escolha = 0;
        
        DadosAnimais DA = new DadosAnimais();
        
        String idBicho = "";
                
        do
        {
            escolha = JOptionPane.showOptionDialog(null, "Selecione opção", "Zoo", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, Menu, null);
            
            if (escolha == 5) break;
            
            switch(escolha)
            {
                case 0 ->
                {
                    Pattern mask = Pattern.compile("^[A-Za-z]{2}-[0-9]{2}$");
                    
                    do
                    {
                        idBicho = JOptionPane.showInputDialog(null, "Insira o Id do Bicho no formato aa-99: ", "aa-99");

                        Matcher Mat = mask.matcher(idBicho);

                        if(Mat.matches())
                        {
                            JOptionPane.showMessageDialog(null, "Id válido!", "Insira Bicho", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Id inválido!", "Insira Bicho", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(true);
                    
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome do animal: ");
                    
                    String cor = JOptionPane.showInputDialog(null, "Digite o cor do animal: ");
                    
                    String ambiente = JOptionPane.showInputDialog(null, "Digite o ambiente do animal: ");
                    
                    float comprimento = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o comprimento do animal em cm: "));
                    
                    float velocidade = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o velocidade do animal em metros por segundo: "));
                    
                    int patas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de patas do animal: "));
                    
                    Animais A = new Animais(idBicho, nome, cor, ambiente, comprimento, velocidade, patas);
                    
                    DA.adicionarBicho(A);
                }
                
                case 1 ->
                {
                    DA.mostraBichos();
                }
                
                case 2 ->
                {
                    idBicho = JOptionPane.showInputDialog(null, "Insira o Id do Bicho no formato aa-99: ", "aa-99");
                    DA.mataBicho(idBicho);
                }
                
                case 3 ->
                {
                    //guardar os dados num ficheiro csv.
                    
                    try
                    {
                        FileOutputStream Fic = new FileOutputStream("Bichos.csv"); //path
                        
                        OutputStreamWriter Saida = new OutputStreamWriter(Fic);
                        
                        Saida.write(DA.devolveBichos());
                        
                        Saida.close();
                        
                        JOptionPane.showMessageDialog(null, "Ficheiro csv. criado com sucesso!", "Exportar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null, "Erro na criação do ficheiro de dados csv.", "Exportar", JOptionPane.ERROR_MESSAGE);
                        }
                    
                }
                
                case 4 ->
                {
                    DA.ListaBichos.clear();
                    
                    BufferedReader Ler;
                    
                    try
                    {
                        Ler = new BufferedReader(new FileReader("Bichos.csv")); //path
                        
                        String Linha = Ler.readLine();
                        
                        while(Linha!=null)
                        {
                            String[] V = Linha.split(";");
                        
                            Animais A = new Animais(V[0],V[1],V[2],V[3],Float.parseFloat(V[4]),Float.parseFloat(V[5]),Integer.parseInt(V[6]));
                            
                            DA.adicionarBicho(A);
                            Linha = Ler.readLine();
                        }
                        
                        
                        JOptionPane.showMessageDialog(null, "Ficheiro csv. importado com sucesso!", "Importar", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch(IOException e)
                        {
                            JOptionPane.showMessageDialog(null, "Erro na importação do ficheiro de dados csv.", "Importar", JOptionPane.ERROR_MESSAGE);
                        }
                }
            }
        }while(true);
    }
}
