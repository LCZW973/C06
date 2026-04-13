import Loja.Brownie.BrownieCafe;
import Loja.Brownie.BrownieDoceDeLeite;
import Loja.Brownie.BrownieNutella;

public class Main {

    void main(String[] args)
    {
        BrownieNutella bn = new BrownieNutella("Brownie Nutella",5.40,"Nutella");

        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Brownie Doce De Leite",4.30,"Doce de Leite");

        BrownieCafe bc = new BrownieCafe("Brownie de Cafe",4.0,"Cafe");

        Comprador comprador = new Comprador("Leo",50);

        comprador.efetuarCompra(bn);
        comprador.efetuarCompra(bc);
        comprador.efetuarCompra(bd);

    //    bn.mostraInfo();
    //    bn.adicionaNutella();
    //    bn.addCarrinhoDeCompras();
    //    bn.calculaValorDaCompra();

    //    bd.mostraInfo();
    //    bd.adicionaDoceDeLeite();
      //  bd.addCarrinhoDeCompras();
        //bd.calculaValorDaCompra();

        //bc.mostraInfo();
       // bc.adicionaCafe();
        //bc.addCarrinhoDeCompras();
        //bc.calculaValorDaCompra();
    }
}
