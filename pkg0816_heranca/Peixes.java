package pkg0816_heranca;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Peixes extends Animais
{
    private String caracteristicas;

    public String getCaracteristicas() 
    {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) 
    {
        this.caracteristicas = caracteristicas;
    }
    
    public Peixes(String idBicho, String nome, String cor, String ambiente, float comprimento, float velocidade, int patas, String caracteristicas)
    {
        super(idBicho, nome, cor, ambiente, comprimento, velocidade, patas);
        this.caracteristicas = caracteristicas;
    }
    
    public void dadosPeixe()
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
                "\nCaracteristicas: "+this.caracteristicas, 
            "Classe Peixes", 
            JOptionPane.INFORMATION_MESSAGE);
    }
}
