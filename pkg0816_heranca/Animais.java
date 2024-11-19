package pkg0816_heranca;

public class Animais 
{
    private String idBicho;
    private int patas;
    private String nome;
    private String cor;
    private String ambiente;
    private float comprimento;
    private float velocidade;
// -----------------------------------------------------------------------------
    
    public Animais(String idBicho, String nome, String cor, String ambiente, float comprimento, float velocidade, int patas)
    {
        this.idBicho = idBicho;
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.velocidade = velocidade;
        this.patas = patas;
    }
    
    public String registoBicho()
    {
        return ("Id: " + this.idBicho + 
                " | Nome: " + this.nome + 
                " | Cor: " + this.cor + 
                " | Ambiente: " + this.ambiente + 
                " | Comprimento: " + this.comprimento + 
                " | Velocidade: " + this.velocidade + 
                " | Patas: " + this.patas);
    }
    
// -----------------------------------------------------------------------------
    
    public String getIdBicho() {
        return idBicho;
    }

    public void setIdBicho(String idBicho) {
        this.idBicho = idBicho;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
}
