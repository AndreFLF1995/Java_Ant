package pkg0816_ft.pkg05;

import java.text.DecimalFormat;

public class Administradores extends Funcionarios
{
    private int horas;

    public int getHoras() 
    {
        return horas;
    }

    public void setHoras(int horas) 
    {
        this.horas = horas;
    }
    
    public Administradores(String nome, String contacto, String email, float salario, int horas)
    {
        super(nome, contacto, email, salario);
        this.horas = horas;
    }
    
    public String registoAdministradores()
    {
        DecimalFormat SL1 = new DecimalFormat("\u20AC,##0.00");
        
        return ("Nome: " + this.getNome() + 
                " | Contacto: " + this.getContacto() + 
                " | Email: " + this.getEmail() + 
                " | Salario: " + SL1.format(super.getSalario()) + 
                " | Horas Extra: " + this.horas + 
                " | Salario Total: " + SL1.format(salarioTotal()));
    }
    
    public float salarioTotal()
    {
        float extra = (this.horas * 3) + super.getSalario();
        
        return extra;
    }
    
    
    /*
    Nos administrativos as horas extras são pagas a 3 euros à hora.
    
    Nos três casos, o método que imprime o salário deve apresentar a formatação em
euros (use a classe DecimalFormat).
    */
}
