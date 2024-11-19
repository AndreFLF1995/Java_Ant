package pkg0816_classes;

import javax.swing.JOptionPane;

public class Triangulo 
{
    public static void triangulo()
    {
        Dimensao Triangulo = new Dimensao();
        
        do{
            try
            {
                Triangulo.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura: ")));
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
                Triangulo.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base: ")));
                break;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Deve inserir um n�mero", "Base", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        Triangulo.setTipo("Tri�ngulo");

        JOptionPane.showMessageDialog(null, "A �rea do "+ Triangulo.getTipo()+ " � "+Triangulo.Area(), "�rea do Tri�ngulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
