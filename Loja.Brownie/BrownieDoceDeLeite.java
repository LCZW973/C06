package Loja.Brownie;


public  class BrownieDoceDeLeite extends Brownie
{
    public  BrownieDoceDeLeite(String nome,double preco , String sabor)
    {
        super (nome,preco,sabor);
    }
    public void adicionaDoceDeLeite()
    {
        System.out.println("adiciona mais doce de leite ");
    }

    @Override
    public  void addCarrinhoDeCompras()
    {
        System.out.println("brownie de doce de leite add !!!");
    }
}
