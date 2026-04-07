public class Main
{
    public static void main(String[] args)
    {
        BrownieNutella brownieNutella = new BrownieNutella("brownie nutella",5.60,"Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite=new BrownieDoceDeLeite("brownie doce de leite",4.40,"Doce de Leite");
        BrownieCafe brownieCafe=new BrownieCafe("Cafe",4,"Cafe");

        Comprador comprador = new Comprador("leo",50);


        int estado;
        estado=1;
        switch(estado)
        {
            case 1 :
                comprador.efetuarCompras(brownieNutella);
                break;
            case 2 :
                comprador.efetuarCompras(brownieCafe);
                break;
            case 3 :
                comprador.efetuarCompras(brownieDoceDeLeite);
            default :
                break;
        }
    }
}
