package pkg0816_classes;

public class Dimensao 
{
    private float Altura, Base;
    private String Tipo;
    // caso seja private, necessitamos de getters e setters. Predefinido é public, e aí não precisamos de usa-los
    
    //Setters
    public void setAltura(float Altura)
    {
        this.Altura = Altura;
    }
    
    public void setBase(float Base)
    {
        this.Base = Base;
    }
    
    public void setTipo(String Tipo)
    {
        this.Tipo = Tipo;
    }
    
    //Getters
    public float getAltura()
    {
        return (this.Altura);
    }
    
    public float getBase()
    {
        return (this.Base);
    }
    
    public String getTipo()
    {
        return (this.Tipo);
    }
    
    public float Area()
    {
        if (Tipo.equals("Triângulo"))
        {
            return (Altura*Base)/2;
        }
        else if (Tipo.equals("Quadrado"))
        {
            return (Altura*Altura);
        }
        else
        {
            return (Altura*Base);
        }
    }
}
