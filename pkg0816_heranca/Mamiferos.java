package pkg0816_heranca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Mamiferos extends Animais 
{
    private String alimento;

    public String getCaracteristicas() 
    {
        return alimento;
    }

    public void setCaracteristicas(String alimento) 
    {
        this.alimento = alimento;
    }
    
    public Mamiferos(String idBicho, String nome, String cor, String ambiente, float comprimento, float velocidade, int patas, String alimento)
    {
        super(idBicho, nome, cor, ambiente, comprimento, velocidade, patas);
        this.alimento = alimento;
    }
    
    public void dadosMamifero()
    {
        DecimalFormat FT1 = new DecimalFormat("0.00 cm");
        DecimalFormat FT2 = new DecimalFormat("0.00 ms");
        
        JOptionPane.showMessageDialog(
            null, 
                "IdBicho: "+this.getIdBicho()+
                "\nNome: "+this.getNome()+
                "\nCor: "+this.getCor()+
                "\nAmbiente: "+this.getAmbiente()+
                "\nComprimento: "+FT1.format(super.getComprimento())+
                "\nVelocidade: "+FT2.format(super.getVelocidade())+
                "\nPatas: "+this.getPatas()+
                "\nAlimento: "+this.alimento, 
            "Classe Peixes", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
