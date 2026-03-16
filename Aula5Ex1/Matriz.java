import java.util.Random;
public class Matriz {
    int[][] tabela = new int[8][8];


    void insertone(int numeroBombas) {
        int x;
        int z;
        Random random = new Random();
        for (int i = 0; i < numeroBombas; i++) {
            x = random.nextInt(8);
            z = random.nextInt(8);
            if (tabela[x][z] == 0)
                tabela[x][z] = 1;
            else
                i--;
        }
    }

    boolean comparamatriz(int linha, int coluna) {
        if (tabela[linha][coluna] == 1)
            return true;
        else
            return false;

    }

    int somaaoredor(int linha, int coluna) {
        int soma = 0;

        for(int i = linha -1; i<=linha+1 ; i++) {
            for (int j = coluna - 1; j <= coluna + 1; j++) {
                if( i >= 0 && i< tabela.length  && j>=0  && j< tabela[0].length && !(i == linha && j == coluna)  )
                    soma = soma+tabela[i][j];
            }
        }
        return soma ;
    }
    void mostrarmatriz() {
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                System.out.print(" " + tabela[i][j] + " ");
            }
            System.out.println();
        }
    }
}
