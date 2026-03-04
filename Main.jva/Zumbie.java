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
    public boolean transfereVida(Zumbie zumbiAlvo,double quantia)
    {
        if(vida>=quantia) {
            zumbiAlvo.vida = zumbiAlvo.vida + quantia;
            vida = vida - quantia;
            return false;
        }
        else
            return true;
    }

}
