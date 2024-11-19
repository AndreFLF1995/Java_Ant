package pkg0816_ft.pkg05;

import java.text.DecimalFormat;

public class Vendedores extends Funcionarios
{
    private float comissao;

    public float getComissao() 
    {
        return comissao;
    }

    public void setComissao(float comissao) 
    {
        this.comissao = comissao;
    }
    
    public Vendedores(String nome, String contacto, String email, float salario, float comissao)
    {
        super(nome, contacto, email, salario);
        this.comissao = comissao;
    }
    
    public String registoVendedores()
    {
        DecimalFormat SL1 = new DecimalFormat("\u20AC,##0.00");
        
        return ("Nome: " + this.getNome() + 
                " | Contacto: " + this.getContacto() + 
                " | Email: " + this.getEmail() + 
                " | Salario: " + SL1.format(super.getSalario()) + 
                " | Vendas: " + this.comissao +
                " | Salario Total: " + SL1.format(salarioTotal()));
    }
    
    public double salarioTotal()
    {
        double salarioTotal = this.comissao * 0.05 + super.getSalario();
        
        return salarioTotal;
    }
    
    /*Os vendedores devem ter um m�todo que imprima o seu sal�rio total considerando
    que a comiss�o � de 5% sobre o valor das vendas.
    
    Nos tr�s casos, o m�todo que imprime o sal�rio deve apresentar a formata��o em
euros (use a classe DecimalFormat).
    */
}
