package br.inatel.cdg.jogador;
import br.inatel.cdg.Bloco.Bloco;
import br.inatel.cdg.conversao.Conversao;
public class Jogador 
{
    private int pontos;
    private Bloco bloco;
    private Conversao conversao;
    
    public void atirar()
    {
        System.out.println("atirar!!");
        bloco.destroibloco();
    }

    public void pontos()
    {
        System.out.println("pontos : "+conversao.calculo); 
    }

    public int getPontos() {
        return pontos;
    }
}
