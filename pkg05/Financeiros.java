package pkg0816_ft.pkg05;

import java.text.DecimalFormat;
import java.util.Random;

public class Financeiros extends Funcionarios
{
    private float premio;

    public float getPremio() 
    {
        return premio;
    }

    public void setPremio(float premio) 
    {
        this.premio = premio;
    }
    
    public Financeiros(String nome, String contacto, String email, float salario, float premio)
    {
        super(nome, contacto, email, salario);
        this.premio = premio;
    }
    
    public String registoFinanceiros()
    {
        DecimalFormat SL1 = new DecimalFormat("\u20AC,##0.00");
        
        return ("Nome: " + this.getNome() + 
                " | Contacto: " + this.getContacto() + 
                " | Email: " + this.getEmail() + 
                " | Salario: " + SL1.format(super.getSalario()) + 
                " | Pr�mio: " + this.premio + 
                " | Salario Total: " + SL1.format(salarioTotal()));
    }
    
    public double salarioTotal()
    {
        double salarioPremio = super.getSalario() + this.premio;
        
        return salarioPremio;
    }
    
    /*
    Nos financeiros o pr�mio mensal � vari�vel.
    
    Nos tr�s casos, o m�todo que imprime o sal�rio deve apresentar a formata��o em
euros (use a classe DecimalFormat).
    */
}
