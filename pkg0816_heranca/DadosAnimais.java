package pkg0816_heranca;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DadosAnimais 
{
    ArrayList<Animais> ListaBichos = new ArrayList();
    
    public void adicionarBicho(Animais Bicho)
    {
        for (Animais A : ListaBichos) 
        {
            if (A.getIdBicho().equals(Bicho.getIdBicho()))
            {
                JOptionPane.showMessageDialog(null, "Id já existe!", "Adicionar Bicho", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }
        
        ListaBichos.add(Bicho);
        JOptionPane.showMessageDialog(null, "Registo Inserido", "Adicionar Bicho", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void mostraBichos()
    {
        if (ListaBichos.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Não existem animais registados.", "Mostra Bicho", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            StringBuilder listaAnimais = new StringBuilder("Lista Animais\n");
        
            for (Animais A : ListaBichos)
            {
                listaAnimais.append(A.registoBicho()).append("\n");
            }
            
            JOptionPane.showMessageDialog(null, listaAnimais, "Mostra Animais", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void mataBicho(String IdBicho) //PETA approved
    {
        for(Animais A : ListaBichos)
        {
           if (A.getIdBicho().equals(IdBicho))
            {
                ListaBichos.remove(A);
                JOptionPane.showMessageDialog(null, "Bicho matado", "Mata Bicho", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Bicho inexistente", "Mata Bicho", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String devolveBichos()
    {
        String lista = "";
        
        for (Animais A : ListaBichos)
        {
            lista += A.getIdBicho() + ";" + 
                    A.getNome() + ";" + 
                    A.getCor() + ";" + 
                    A.getAmbiente() + ";" + 
                    A.getComprimento() + ";" + 
                    A.getVelocidade() + ";" + 
                    A.getPatas() + "\n";
        }
        
        return (lista);
    }
}
