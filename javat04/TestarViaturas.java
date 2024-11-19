package javat04;

import javax.swing.JOptionPane;

public class TestarViaturas 
{
    public static void main(String[] args) 
    {
        String[] opcoes1 = {"Inserir Viatura", "Listar Viaturas", "Eliminar Viatura", "Sair"};
        String[] opcoes2 = {"Listar Viaturas", "Listar por Marca", "Listar com preço"};
        String[] tipoComb = {"Gasolina", "Diesel", "Elétrico", "Híbrido"};
        
        Dados D = new Dados();
        
        int escolha1;
        
        do
        {
            escolha1 = JOptionPane.showOptionDialog(null, "Selecione a sua opção: ", "EMEL", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes1, null);

            switch (escolha1)
            {
                case 0 -> 
                {
                    String matricula = (String) JOptionPane.showInputDialog(null, "Digite a matricula no formato 00-XX-00: ");

                    try 
                    {
                        if (D.verificarMatricula(matricula)) 
                        {
                            throw new Exception("Matrícula já existe!");
                        }

                        String marca = (String) JOptionPane.showInputDialog(null, "Digite a marca: ");

                        String modelo = (String) JOptionPane.showInputDialog(null, "Digite o modelo: ");

                        String combustivel = (String) JOptionPane.showInputDialog(null, "Selecione o combustível: ", "EMEL", JOptionPane.INFORMATION_MESSAGE, null, tipoComb, null);

                        int kilometros = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a quilometragem atual: "));

                        float preco = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o preço da viatura: "));

                        Viaturas V = new Viaturas();


                        V.setMatricula(matricula);

                        V.setMarca(marca);
                        V.setModelo(modelo);
                        V.setCombustivel(combustivel);
                        V.setKilometrosAtuais(kilometros);
                        V.setPreco(preco);

                        D.insereViatura(V);

                        JOptionPane.showMessageDialog(null, "Viatura registada", "EMEL", JOptionPane.INFORMATION_MESSAGE);

                    } 
                    catch (Exception e) 
                    {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }

                case 1 ->
                {
                    int escolha2 = JOptionPane.showOptionDialog(null, "Selecione a sua opção: ", "EMEL", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes2, null);

                    switch (escolha2)
                    {
                        case 0 -> 
                        {
                            JOptionPane.showMessageDialog(null, D.listaViaturas(), "EMEL", JOptionPane.INFORMATION_MESSAGE);
                        }

                        case 1 ->
                        {
                            String marca = (String) JOptionPane.showInputDialog(null, "Digite a marca: ");
                            
                            JOptionPane.showMessageDialog(null, D.listaViaturasMarca(marca), "EMEL", JOptionPane.INFORMATION_MESSAGE);
                        }

                        case 2 ->
                        {
                            JOptionPane.showMessageDialog(null, D.listaViaturas() +"\n\n Preço Total: " + D.listaViaturasPreco(), "EMEL", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
                
                case 2 ->
                {
                    String matricula = (String) JOptionPane.showInputDialog(null, "Insira a matrícula a apagar: ");
                    
                    D.apagarViaturas(matricula);
                }
            }
        } while (escolha1 != 3);
    }
}
