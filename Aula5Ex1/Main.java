import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Campominado campo = new Campominado();
        Matriz matriz = new Matriz();
        campo.matriz = matriz;

        campo.criarcampo();


        System.out.println("Inserir o numero de bombas");
        int numerobombas =sc.nextInt();
        campo.addBomba(numerobombas);

        int linha;
        int coluna;
        int escolha;


        do {
            campo.mostrarcampo();
            System.out.println("Selecione 1 para inserir bandeira e 2 pra escolher casa ");
            escolha = sc.nextInt();
            if (escolha == 1)
            {
                linha = sc.nextInt();
                coluna = sc.nextInt();
                campo.inserirbandeira(linha,coluna);
            }

            System.out.println("Inserir linha e coluna deseejada");
            linha = sc.nextInt();
            coluna = sc.nextInt();

        }while(campo.comparacampo(linha,coluna));



        campo.mostrarcampo();










    }
}
