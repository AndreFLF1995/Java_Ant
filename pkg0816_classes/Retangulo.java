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
                JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Altura", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Base", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        Retangulo.setTipo("Ret�ngulo");

        JOptionPane.showMessageDialog(null, "A �rea do "+Retangulo.getTipo()+" � "+Retangulo.Area(), "�rea do Ret�ngulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
