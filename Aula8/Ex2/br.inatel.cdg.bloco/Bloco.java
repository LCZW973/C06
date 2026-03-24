package br.inatel.cdg.Bloco;

public class Bloco {
    private static int contacriacao=0;
    private static int  blocosquebrados=0;
    public Bloco()
    {
        contacriacao++;
    }
    public void destroibloco()
    {
        blocosquebrados++;
    }


    public static int getContacriacao() {
        return contacriacao;
    }
    public static int getBlocosquebrados() {
        return blocosquebrados;
    }

}
