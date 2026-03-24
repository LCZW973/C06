package br.inatel.cdg.jogador;
import br.inatel.cdg.inimigo.Asteroide;
import static br.inatel.cdg.inimigo.Asteroide.destruir;

public class Nave
{
    private String nome ;
    private double vida;
    private String tipoTiro;

    public Nave(String nome,double vida,String tipoTiro)
    {
        this.nome = nome;
        this.vida = vida;
        this.tipoTiro = tipoTiro;
    }
    public int atirar(Asteroide ast) {
        if ((ast.getTipoAsteroide().equals("Grande")) && !tipoTiro.equals("Explosivo")) {
            System.out.println("Falha em destruir meteoro ");
            return 0;
        }
        destruir();
        return 0 ;
    }


    public String getNome() {
        return nome;
    }
    public double getVida() {
        return vida;
    }
    public String getTipoTiro()
    {
        return tipoTiro;
    }
}
