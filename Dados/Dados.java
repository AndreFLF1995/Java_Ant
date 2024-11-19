package Dados;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Dados 
{
    //criar array dinâmico do tipo MovimentosConta
    ArrayList<MovimentosConta> Movimentos = new ArrayList();
    
    public void adicionarMovimento(MovimentosConta MC)
    {
        Movimentos.add(MC);
    }
    
    public String listaMovimentos()
    {
        String lista = "";
        
        for (int i = 0; i < Movimentos.size(); i++)
        {
            MovimentosConta C = Movimentos.get(i);
            
            lista+="\nN# Mov: " + C.getNumeroMovimento() + 
                    " | Data: " + C.getDataMovimento() + 
                    " | Tipo: " + C.getTipoMovimento() + 
                    " | Valor: "+ C.getValorMovimento();
        }
        return (lista);
    }
    
    public void apagarMovimento(int mov)
    {
        Boolean existe = false;
        
        for (int i = 0; i < Movimentos.size(); i++)
        {
            MovimentosConta C = Movimentos.get(i);
            
            if (C.getNumeroMovimento() == mov)
            {
                Movimentos.remove(i);
                existe = true;
                break;
            }
        }
        
        if (existe)
        {
            JOptionPane.showMessageDialog(null, "Movimento eliminado", "Movimentos Conta", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Movimento não existe", "Movimentos Conta", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void ordena()
    {
        for (int i = 0; i < Movimentos.size(); i++)
        {
            MovimentosConta C = Movimentos.get(i);
            
            C.setNumeroMovimento(i+1);
        }
    }
}
