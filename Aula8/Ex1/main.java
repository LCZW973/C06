import br.inatel.cdg.jogador.Nave;
import br.inatel.cdg.inimigo.Asteroide;
public class Main
{
    static void main(String[] args)
    {


        Nave nave = new Nave("falcon",30,"Explosivo");
        Asteroide asteroide = new Asteroide("Delta","Grande");

        nave.atirar(asteroide);

        System.out.println("Asteroide "+asteroide.getNome());
        System.out.println("Nome da nave "+nave.getNome());
        System.out.println("Nome da tipo de tiro "+nave.getTipoTiro());
        System.out.println("Nome da nave "+nave.getVida());

    }
}
