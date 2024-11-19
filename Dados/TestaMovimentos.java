package Dados;

import javax.swing.JOptionPane;

public class TestaMovimentos 
{
    public static void main(String[] args) 
    {
        String[] opcoes = {"Inserir movimento", "Listar movimentos", "Eliminar movimentos", "Sair"};
        
        String[] operacao = {"Levantamento", "Depósito"};
        
        int escolha;
        
        Dados D = new Dados();
        
        do
        {
            escolha = JOptionPane.showOptionDialog(null, "Selecione a sua opção: ", "SIBS", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
            
            switch (escolha)
            {
                case 0 -> {
                    String Data = JOptionPane.showInputDialog(null, "Digite a data no formato dd-mm-yyyy");
                    
                    String Tipo = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de movimento", "SIBS", JOptionPane.INFORMATION_MESSAGE, null, operacao, null);
                    
                    float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do movimento"));
                    
                    MovimentosConta M = new MovimentosConta();
                    
                    int nmov = D.Movimentos.size()+1;
                    M.setNumeroMovimento(nmov);
                    M.setDataMovimento(Data);
                    M.setTipoMovimento(Tipo);
                    M.setValorMovimento(valor);
                    D.adicionarMovimento(M);
                    
                    JOptionPane.showMessageDialog(null, "Movimento registado", "SIBS", JOptionPane.INFORMATION_MESSAGE);
                }
                
                case 1 -> {
                    JOptionPane.showMessageDialog(null, D.listaMovimentos(), "Movimentos de Conta", JOptionPane.INFORMATION_MESSAGE);
                }
                
                case 2 -> {
                    int nm = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de movimento."));
                    
                    D.apagarMovimento(nm);
                    D.ordena();
                }
            }
        } while(escolha!=3);
    }
}
