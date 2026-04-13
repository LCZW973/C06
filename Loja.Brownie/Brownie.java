package Loja.Brownie;

public class Brownie
{
    protected String nome ;
    protected  double preco ;
    protected String sabor;

    public Brownie(String nome , double preco ,String sabor)
    {
        this.nome = nome ;
        this.preco = preco ;
        this.sabor = sabor ;
    }
    public  void addCarrinhoDeCompras()
    {
        System.out.println("add a compra"+this.nome);
    }
    public  void calculaValorDaCompra()
    {
        System.out.println(this.nome+" valor = "+this.preco);
    }
    public  void mostraInfo()
    {
        System.out.println(this.nome);
        System.out.println(this.preco);
        System.out.println(this.sabor);
    }
}
