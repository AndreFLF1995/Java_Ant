package pkg0816_ft.pkg05;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JOptionPane;

public class TestaFuncionarios 
{
    public static void main(String[] args) 
    {
        String[] Menu = {"Inserir Funcionario", "Listar Funcionario", "Eliminar Funcionario", "Exportar", "Importar", "Sair"};
        
        int escolha = 0;
        
        Dados_Funcionarios DF = new Dados_Funcionarios();
                
        do
        {
            escolha = JOptionPane.showOptionDialog(null, "Selecione opção", "Zoo", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, Menu, null);
            
            switch(escolha)
            {
                case 0 ->
                {
                    String[] MenuFuncionario = {"Administrador", "Financeiro", "Vendedor", "Sair"};
                    
                    escolha = JOptionPane.showOptionDialog(null, "Selecione opção: ", "RH", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, MenuFuncionario, null);
                    
                    switch (escolha)
                    {
                        case 0 ->
                        {
                            String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");
                            
                            String contacto = JOptionPane.showInputDialog(null, "Digite o contacto do funcionario: ");
                            
                            String email = JOptionPane.showInputDialog(null, "Digite o email do funcionario: ");
                            
                            float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do funcionario: "));
                            
                            int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de horas do funcionario: "));
                            
                            Administradores A = new Administradores(nome, contacto, email, salario, horas);
                            
                            DF.adicionarAdministradores(A);
                        }
                        
                        case 1 ->
                        {
                            String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");
                            
                            String contacto = JOptionPane.showInputDialog(null, "Digite o contacto do funcionario: ");
                            
                            String email = JOptionPane.showInputDialog(null, "Digite o email do funcionario: ");
                            
                            float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do funcionario: "));
                            
                            float premio = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o prémio do funcionario: "));
                            
                            Financeiros F = new Financeiros(nome, contacto, email, salario, premio);
                            
                            DF.adicionarFinanceiros(F);
                        }
                        
                        case 2 ->
                        {
                            String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");
                            
                            String contacto = JOptionPane.showInputDialog(null, "Digite o contacto do funcionario: ");
                            
                            String email = JOptionPane.showInputDialog(null, "Digite o email do funcionario: ");
                            
                            float salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salario do funcionario: "));
                            
                            float comissao = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor das vendas do funcionario: "));
                            
                            Vendedores V = new Vendedores(nome, contacto, email, salario, comissao);
                            
                            DF.adicionarVendedores(V);
                        }
                        
                        case 3 -> {break;}
                        
                    }
                }
                
                case 1 ->
                {
                    DF.mostraFuncionarios();
                }
                
                case 2 ->
                {
                    String nome = JOptionPane.showInputDialog(null, "Insira o nome do funcionário ");
                    DF.apagaFuncionario(nome);
                }
                
                case 3 ->
                {
                    //guardar os dados num ficheiro csv.
                    
                    try
                    {
                        FileOutputStream Fic = new FileOutputStream("Funcionarios.csv"); //path
                        
                        OutputStreamWriter Saida = new OutputStreamWriter(Fic);
                        
                        Saida.write(DF.devolveFuncionarios());
                        
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
                    DF.ListaAdministradores.clear();
                    DF.ListaFinanceiros.clear();
                    DF.ListaVendedores.clear();

                    BufferedReader Ler;

                    try 
                    {
                        Ler = new BufferedReader(new FileReader("Funcionarios.csv")); // path to your CSV

                        String Linha = Ler.readLine();

                        while (Linha != null) 
                        {
                            String[] V = Linha.split(";");

                            String type = V[0];

                            switch (type) 
                            {
                                case "Administrador":
                                    Administradores A = new Administradores(V[1], V[2], V[3], Float.parseFloat(V[4]), Integer.parseInt(V[5]));
                                    DF.ListaAdministradores.add(A);
                                    break;
                                case "Financeiro":
                                    Financeiros F = new Financeiros(V[1], V[2], V[3], Float.parseFloat(V[4]), Float.parseFloat(V[5]));
                                    DF.ListaFinanceiros.add(F);
                                    break;
                                case "Vendedor":
                                    Vendedores Vendedor = new Vendedores(V[1], V[2], V[3], Float.parseFloat(V[4]), Float.parseFloat(V[5]));
                                    DF.ListaVendedores.add(Vendedor);
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Tipo de funcionário desconhecido: " + type, "Erro", JOptionPane.ERROR_MESSAGE);
                                    break;
                            }
                            Linha = Ler.readLine();
                        }

                        JOptionPane.showMessageDialog(null, "Ficheiro csv. importado com sucesso!", "Importar", JOptionPane.INFORMATION_MESSAGE);
                    } 
                    catch (IOException e) 
                    {
                        JOptionPane.showMessageDialog(null, "Erro na importação do ficheiro de dados csv.", "Importar", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }while(escolha!=5);
    }
}
