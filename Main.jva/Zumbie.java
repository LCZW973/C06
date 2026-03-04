public class Zumbie {
    String nome;
    double vida;

    public void grito()
    {
        System.out.println( nome + " Ahhhh!!!!Ahhhh!!!! ");
    }

    public double mostraVida(){
        System.out.print("o zumbie " + nome + " tem vida : ");
        return vida;
    }
    public void transfereVida(Zumbie zumbiAlvo,double quantia)
    {
        zumbiAlvo.vida=zumbiAlvo.vida+quantia;
        vida = vida-quantia;
    }

}
