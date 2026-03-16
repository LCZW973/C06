import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Campominado campo = new Campominado();
        Matriz matriz = new Matriz();
        campo.matriz = matriz;

        campo.criarcampo();
        campo.inicializaganhador();


        System.out.println("Inserir o numero de bombas");
        int numerobombas =sc.nextInt();
        campo.addBomba(numerobombas);
        int indicevitoria = 64 - numerobombas-1 ;


        int linha;
        int coluna;
        int escolha;
        int i =  0 ;
        int j = 0 ;

        campo.matriz.mostrarmatriz();

        do {
            do {
                campo.mostrarcampo();
                System.out.println("Selecione 1 para inserir bandeira e 2 pra escolher casa ");
                escolha = sc.nextInt();
                if (escolha == 1) {
                    System.out.println("linha e coluna da  bandeira");
                    linha = sc.nextInt();
                    coluna = sc.nextInt();
                    campo.inserirbandeira(linha, coluna);
                }

                System.out.println("Inserir linha e coluna deseejada");
                linha = sc.nextInt();
                coluna = sc.nextInt();
                j++;
            } while (campo.comparacampo(linha, coluna));

            if( campo.confereseganhou(linha,coluna,indicevitoria,i)) {
                i++;
            }


        }while( campo.ganhador[indicevitoria] == 0 );

        System.out.println(" Parabens ! voce chegou ao fim com " + j  + " jpgadas ");
        campo.mostrarcampo();

       sc.close();
    }
}
