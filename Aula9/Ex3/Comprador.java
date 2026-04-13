import Loja.Brownie.Brownie;

public class Comprador {
    private String nome;
    private double saldo;

    public Comprador(String nome, double saldo)
    {
        this.nome = nome;
        this.saldo = saldo;
    }
    public void efetuarCompra(Brownie brownie)
    {
        double preco;
        brownie.addCarrinhoDeCompras();
        preco = brownie.calculaValorDaCompra();
        saldo = saldo - preco;
    }
}
