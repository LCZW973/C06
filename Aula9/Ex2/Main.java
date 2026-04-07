public class Main {
    public static void main(String[] args)
    {
        BrownieNutella brownieNutella = new BrownieNutella("brownie nutella",5.60,"Nutella");
        BrownieDoceDeLeite brownieDoceDeLeite=new BrownieDoceDeLeite("brownie doce de leite",4.40,"Doce de Leite");
        BrownieCafe brownieCafe=new BrownieCafe("Cafe",4,"Cafe");

        brownieNutella.mostraInfo();
        brownieNutella.adicionaNutella();
        brownieNutella.addCarrrinhodeCompras();
        brownieNutella.calcularValoTotalDaCompra();

        brownieDoceDeLeite.mostraInfo();
        brownieDoceDeLeite.adicionaDoceDeLeite();
        brownieDoceDeLeite.addCarrrinhodeCompras();
        brownieDoceDeLeite.calcularValoTotalDaCompra();

        brownieCafe.mostraInfo();
        brownieCafe.adicionaCafe();
        brownieCafe.addCarrrinhodeCompras();
        brownieCafe.calcularValoTotalDaCompra();
    }
}
