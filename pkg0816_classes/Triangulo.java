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
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "Altura", JOptionPane.ERROR_MESSAGE);
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
                JOptionPane.showMessageDialog(null, "Deve inserir um número", "Base", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        
        Triangulo.setTipo("Triângulo");

        JOptionPane.showMessageDialog(null, "A área do "+ Triangulo.getTipo()+ " é "+Triangulo.Area(), "Área do Triângulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
