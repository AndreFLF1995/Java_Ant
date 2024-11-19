package pkg0816_ft.pkg05;

import java.text.DecimalFormat;

public class Funcionarios 
{
    private String nome;
    private String contacto;
    private String email;
    private float salario;

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getContacto() 
    {
        return contacto;
    }

    public void setContacto(String contacto) 
    {
        this.contacto = contacto;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
    
    public float getSalario() 
    {
        return salario;
    }

    public void setSalario(float salario) 
    {
        this.salario = salario;
    }
    
    public Funcionarios(String nome, String contacto, String email, float salario)
    {
        this.nome = nome;
        this.contacto = contacto;
        this.email = email;
        this.salario = salario;
    }
}
