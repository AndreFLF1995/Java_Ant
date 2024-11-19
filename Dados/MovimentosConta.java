package Dados;

public class MovimentosConta 
{
    private int numeroMovimento;
    private String dataMovimento, tipoMovimento;
    private float valorMovimento;

    public int getNumeroMovimento() 
    {
        return numeroMovimento;
    }

    public void setNumeroMovimento(int numeroMovimento) 
    {
        this.numeroMovimento = numeroMovimento;
    }

//-------------------------------------
    public String getDataMovimento() 
    {
        return dataMovimento;
    }

    public void setDataMovimento(String dataMovimento) 
    {
        this.dataMovimento = dataMovimento;
    }
    
//-------------------------------------
    public String getTipoMovimento() 
    {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) 
    {
        this.tipoMovimento = tipoMovimento;
    }

//-------------------------------------
    public float getValorMovimento() 
    {
        return valorMovimento;
    }

    public void setValorMovimento(float valorMovimento) 
    {
        this.valorMovimento = valorMovimento;
    }
}
