public class Campominado {
    String [][] campo = new String[10][10];
    Matriz matriz = new Matriz();
    void criarcampo()
    {
        for(int i = 0 ; i <8;i++)
            for(int j = 0 ; j<8;j++)
                campo[i][j] = "?";
    }
    void inserirbandeira(int i ,int j)
    {
        campo[i][j] = "b" ;
    }
    void mostrarcampo()
    {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.print(" | " + campo[i][j] + " | ");
            System.out.println(" ");

        }
    }
    void addBomba (int numeroBombas)
    {
       matriz.insertone(numeroBombas);
    }
     boolean comparacampo(int linha,int coluna)
    {
        if(matriz.comparamatriz(linha,coluna))
        {
            campo[linha][coluna] = "*";
            return true;
        }
            else
                campo[linha][coluna] = String.valueOf(matriz.somaaoredor(linha,coluna));

            return false;
    }


     }
