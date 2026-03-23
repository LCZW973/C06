package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;
public class Nave 
{
    private String nome ;
    private double vida;
    private String tipoTiro;
    private Asteroide asteroide;

    public Nave(String nome,double vida,String tipoTiro)
    {
       this.nome = nome;
       this.vida = vida;
       this.tipoTiro = tipoTiro;
    }
    public atirar(Asteroide ast)
    {
        
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    public double getVida() {
        return vida;
    }

    public void setTipoTiro(String tipoTiro)
    {
        this.tipoTiro = tipoTiro;
    }
    public String getTipoTiro() 
    {
        return tipoTiro;
    }
}
