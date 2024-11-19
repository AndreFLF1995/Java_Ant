package javat04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class Dados 
{
    ArrayList<Viaturas> Viaturas = new ArrayList();
    
    public void insereViatura(Viaturas VT)
    {
        Viaturas.add(VT);
    }
    
    public boolean verificarMatricula(String matricula) {
        for (Viaturas V : Viaturas) {
            if (V.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }
    
    public String listaViaturas()
    {
        String lista = "";
        
        for (int i = 0; i < Viaturas.size(); i++)
        {
            Viaturas V = Viaturas.get(i);
            
            lista+="\n| Matrícula: " + V.getMatricula() + 
                    "  |  Marca: " + V.getMarca() + 
                    "  |  Modelo: " + V.getModelo() + 
                    "  |  Combustível: " + V.getCombustivel() +
                    "  |  Kilometragem: " + V.getKilometrosAtuais() +
                    "  |  Preço: " + V.getPreco();
        }
        return (lista);
    }
    
    public String listaViaturasMarca(String marca)
    {
        String listaMarca = "";
        
        for (int i = 0; i < Viaturas.size(); i++)
        {
            Viaturas V = Viaturas.get(i);
            
            if(V.getMarca().equals(marca))
            {
            listaMarca+="\n| Matrícula: " + V.getMatricula() + 
                    "  |  Marca: " + V.getMarca() + 
                    "  |  Modelo: " + V.getModelo() + 
                    "  |  Combustível: " + V.getCombustivel() +
                    "  |  Kilometragem: " + V.getKilometrosAtuais() +
                    "  |  Preço: " + V.getPreco();
            }
        }
        return (listaMarca);
    }
    
    public float listaViaturasPreco()
    {
        float precoTotal = 0;
        
        for (int i = 0; i < Viaturas.size(); i++)
        {
            Viaturas V = Viaturas.get(i);
            
            precoTotal += V.getPreco();
        }
        
        return precoTotal;
    }
    
    public void apagarViaturas(String matricula)
    {
        Boolean existe = false;
        
        for (int i = 0; i < Viaturas.size(); i++)
        {
            Viaturas V = Viaturas.get(i);
            
            if (V.getMatricula().equals(matricula))
            {
                Viaturas.remove(i);
                existe = true;
                break;
            }
        }
        
        if (existe)
        {
            JOptionPane.showMessageDialog(null, "Viatura eliminada", "EMEL", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Viatura não existe", "EMEL", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
