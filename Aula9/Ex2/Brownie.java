public class Brownie
{
    protected String nome;
    protected double preco;
    protected String sabor;

    public Brownie(String nome, double preco , String sabor)
    {
        this.nome=nome;
        this.sabor=sabor;
        this.preco=preco;
    }
    public void addCarrrinhodeCompras()
    {
        System.out.println("o brownie de "+sabor+" foi add ao carrinho ");
    }
    public void calcularValoTotalDaCompra()
    {
        System.out.println("OO preco do "+nome+" custa "+preco);
        System.out.println(" ");
    }
    public void mostraInfo()
    {
        System.out.println("nome : "+nome);
        System.out.println("preco : "+preco);
        System.out.println("sabor : "+sabor);
    }
}
