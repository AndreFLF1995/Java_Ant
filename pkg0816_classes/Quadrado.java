package pkg0816_classes;

import javax.swing.JOptionPane;

public class Quadrado 
{
    public static void quadrado() 
    {
        Dimensao Quadrado = new Dimensao();

        do{
            try
            {
                Quadrado.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                break;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "Lado", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        Quadrado.setTipo("Quadrado");
        
        JOptionPane.showMessageDialog(null, "A área do "+ Quadrado.getTipo() + " é "+Quadrado.Area(), "Área do Quadrado", JOptionPane.INFORMATION_MESSAGE);
    }
}
