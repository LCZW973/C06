import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arma ARma=new Arma();
        ARma.nome = " Master Sword ";
        ARma.poder = 5;
        ARma.resistencia = 20;
        ARma.descricao = " A Master Sword, ou Espada Mestra, é a lendária lâmina que expulsa o mal na série The Legend of Zelda. Empunhada por Link, ela é uma espada mágica, geralmente roxa com guarda em forma de asas e um símbolo da Triforce, frequentemente usada para selar a escuridão e derrotar Ganon ";

        Personagem personagem = new Personagem();
        personagem.nome = " Stark " ;
        personagem.pontos = 50 ;

        personagem.arma = ARma;

        personagem.arma.mostraInfoArma();
        personagem.tomarDano();
        personagem.usarArma();
        personagem.arma.mostraInfoArma();

        sc.close();
    }
}
