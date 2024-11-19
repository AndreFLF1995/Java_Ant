package pkg0816_ft.pkg05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Dados_Funcionarios 
{
    ArrayList<Administradores> ListaAdministradores = new ArrayList();
    ArrayList<Financeiros> ListaFinanceiros = new ArrayList();
    ArrayList<Vendedores> ListaVendedores = new ArrayList();
    
    public void adicionarAdministradores(Administradores admin)
    {
        ListaAdministradores.add(admin);
        JOptionPane.showMessageDialog(null, "Registo Inserido", "Adicionar Administrador", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void adicionarFinanceiros(Financeiros fin)
    {
        ListaFinanceiros.add(fin);
        JOptionPane.showMessageDialog(null, "Registo Inserido", "Adicionar Financeiro", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void adicionarVendedores(Vendedores ven)
    {
        ListaVendedores.add(ven);
        JOptionPane.showMessageDialog(null, "Registo Inserido", "Adicionar Vendedor", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostraFuncionarios()
    {
        if (ListaAdministradores.isEmpty() && ListaFinanceiros.isEmpty() && ListaVendedores.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Não existem funcionários registados.", "Mostra Funcionários", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            StringBuilder listaFuncionarios = new StringBuilder("Lista Funcionários\n");
        
            for (Administradores A : ListaAdministradores)
            {
                listaFuncionarios.append("Administrativos:\n").append(A.registoAdministradores()).append("\n");
            }
            
            for (Financeiros F : ListaFinanceiros)
            {
                listaFuncionarios.append("\nFinanceiros:\n").append(F.registoFinanceiros()).append("\n");
            }
            
            for (Vendedores V : ListaVendedores)
            {
                listaFuncionarios.append("\nVendedores:\n").append(V.registoVendedores()).append("\n");
            }
            
            JOptionPane.showMessageDialog(null, listaFuncionarios, "Mostra Funcionários", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void apagaFuncionario(String nome)
    {
        for(Administradores A : ListaAdministradores)
        {
           if (A.getNome().equals(nome))
            {
                ListaAdministradores.remove(A);
                JOptionPane.showMessageDialog(null, "Funcionário Despedido!", "Despede Funcionário", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        for(Financeiros F : ListaFinanceiros)
        {
           if (F.getNome().equals(nome))
            {
                ListaFinanceiros.remove(F);
                JOptionPane.showMessageDialog(null, "Funcionário Despedido!", "Despede Funcionário", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        for(Vendedores V : ListaVendedores)
        {
           if (V.getNome().equals(nome))
            {
                ListaVendedores.remove(V);
                JOptionPane.showMessageDialog(null, "Funcionário Despedido!", "Despede Funcionário", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Funcionário inexistente", "Despede Funcionário", JOptionPane.INFORMATION_MESSAGE);

    }
    
    public String devolveFuncionarios() //ficheiro csv.
    {
        String lista = "";
        
        for (Administradores A : ListaAdministradores)
        {
            lista +="Administrador" + ";" + 
                    A.getNome() + ";" + 
                    A.getContacto() + ";" + 
                    A.getEmail() + ";" + 
                    A.getSalario() + ";" +
                    A.getHoras() + ";" +
                    A.salarioTotal() + "\n";
        }
        
        for (Financeiros F : ListaFinanceiros)
        {
            lista +="Financeiro" + ";" + 
                    F.getNome() + ";" + 
                    F.getContacto() + ";" + 
                    F.getEmail() + ";" + 
                    F.getSalario() + ";" +
                    F.getPremio() + ";" +
                    F.salarioTotal() + "\n";
        }
        
        for (Vendedores V : ListaVendedores)
        {
            lista +="Vendedor" + ";" + 
                    V.getNome() + ";" + 
                    V.getContacto() + ";" + 
                    V.getEmail() + ";" + 
                    V.getSalario() + ";" +
                    V.getComissao() + ";" +
                    V.salarioTotal() + "\n";
        }
        
        return (lista);
    }
}
