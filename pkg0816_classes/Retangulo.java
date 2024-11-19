package pkg0816_classes;

import javax.swing.JOptionPane;

public class Retangulo 
{
    public static void retangulo() 
    {
        Dimensao Retangulo = new Dimensao();

        do{
            try
            {
                Retangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura: ")));
                break;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);

        do{
            try
            {
                Retangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base: ")));
                break;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "Base", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        Retangulo.setTipo("Retângulo");

        JOptionPane.showMessageDialog(null, "A área do "+Retangulo.getTipo()+" é "+Retangulo.Area(), "Área do Retângulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
