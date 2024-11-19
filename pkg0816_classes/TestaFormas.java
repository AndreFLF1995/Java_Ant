package pkg0816_classes;

import javax.swing.JOptionPane;

public class TestaFormas 
{
    public static void main(String[] args) 
    {
        String[] opcoes = {"Triângulo", "Rectângulo", "Quadrado", "Terminar"};
        
        int escolha = 0;
        
        do
        {
            escolha = JOptionPane.showOptionDialog(null, "Selecione a figura geométrica:", "Área", 
                      JOptionPane.YES_NO_OPTION, 
                      JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
            
            Dimensao F = new Dimensao();
            F.setTipo(opcoes[escolha]);
            
            switch (escolha)
            {
                case 0 -> 
                { 
                    do{
                        try
                        {
                            F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura: ")));
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
                            F.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base: ")));
                            break;
                        }
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Base", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(true);

                            
                }
                
                case 1 -> 
                { 
                    do{
                        try
                        {
                            F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da altura: ")));
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
                            F.setBase(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da base: ")));
                            break;
                        }
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Base", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(true);

                    JOptionPane.showMessageDialog(null, "A área do "+F.getTipo()+" é "+F.Area(), "Área do Retângulo", JOptionPane.INFORMATION_MESSAGE);
                }
                
                case 2 -> 
                {
                    do{
                        try
                        {
                            F.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do lado: ")));
                            break;
                        }
                        catch(NumberFormatException e)
                        {
                            JOptionPane.showMessageDialog(null, "Deve inserir um número", "Lado", JOptionPane.ERROR_MESSAGE);
                        }
                    }while(true);

                }
            }
            
            if (escolha != 3)
            {
                JOptionPane.showMessageDialog(null, "A área do "+ F.getTipo()+ " é "+F.Area(), "Área do" + F.getTipo(), JOptionPane.INFORMATION_MESSAGE);
            }
            
        }while(escolha != 3);
    }
}