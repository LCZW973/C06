public class Personagem {

    String nome ;
    int pontos ;
    Arma arma ;

    public void usarArma()
    {
        System.out.println("ATAQUE REALIZADO");
      arma.resistencia=arma.resistencia - 2;
    }
    public void tomarDano()
    {
     pontos = pontos - 5;
    }
}
