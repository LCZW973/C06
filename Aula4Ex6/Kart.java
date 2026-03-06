public class Kart {
    String Kart ;
    Piloto piloto;
    Motor motor ;

    public Kart(){
        motor = new Motor();
    }

    public void pular()
    {
        System.out.println("Pula!!!");
    }

    public void soltarTurbo()
    {
        System.out.println("TURBO ATIVADO!!");
    }

    public void fazerDrift()
    {
        System.out.println("Fazer drift");
    }

}
