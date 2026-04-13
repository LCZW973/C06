package Loja.Brownie;

public  class BrownieCafe extends Brownie
{
    public  BrownieCafe(String nome,double preco , String sabor)
    {
        super (nome,preco,sabor);
    }
    public void adicionaCafe()
    {
        System.out.println("adiciona mais Cafe!! ");
    }
    @Override
    public  void addCarrinhoDeCompras()
    {
        System.out.println("brownie de cafe add !!!");
    }
}
