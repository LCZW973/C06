public class Comprador
{
    String nome ;
    double saldo;
    public Comprador(String nome,double saldo)
    {
        this.nome=nome;
        this.saldo=saldo;
    }
    public void efetuarCompras(Brownie brownie)
    {
        if(saldo>brownie.preco)
        {
            System.out.println("compra de brownie de "+brownie.nome+" com o preco de "+brownie.preco);
            saldo=saldo- brownie.preco;
        }
    }
}
