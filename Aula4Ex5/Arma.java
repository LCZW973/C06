public class Arma {
    String nome = " Master Sword ";
    int poder = 5;
    int resistencia = 20;
    String descricao = " A Master Sword, ou Espada Mestra, é a lendária lâmina que expulsa o mal na série The Legend of Zelda. Empunhada por Link, ela é uma espada mágica, geralmente roxa com guarda em forma de asas e um símbolo da Triforce, frequentemente usada para selar a escuridão e derrotar Ganon ";

    public void mostraInfoArma() {
        System.out.println(" Arma :" + nome);
        System.out.println(" poder : " + poder );
        System.out.println(" resistencia : " + resistencia);
        System.out.println(" descricao :" + descricao);
    }
    
}    
