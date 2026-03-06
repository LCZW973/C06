import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Kart Kart1 = new Kart();
        Piloto Piloto1 = new Piloto();
        Kart1.piloto = Piloto1;

        Kart Kart2 = new Kart();
        Piloto Piloto2 = new Piloto();
        Kart2.piloto = Piloto2;


        System.out.println("insira o nome,o numero de cilindradas(50,100 e 150),e a velocidade (0 < v <150) do primeiro jogador");
        Kart1.piloto.nome = sc.nextLine( );
        Kart1.motor.cilindradas = sc.nextLine();
        Kart1.motor.velocidadeMaxima = sc.nextFloat();
        sc.nextLine();

        System.out.println("insira o nome,o numero de cilindradas(50,100 e 150),e a velocidade (0 < v <150) do segundo jogador");
        Kart2.piloto.nome = sc.nextLine();
        Kart2.motor.cilindradas = sc.nextLine();
        Kart2.motor.velocidadeMaxima = sc.nextFloat();

        System.out.println("COMANDOS : 1 Soltar super poder , 2 pular , 3 soltar turbo , 4 fazer drift , 5 mostra Info , outro numero =  encerrar ");

        boolean loop = true;
        int acao;


    do{
       acao = sc.nextInt();
            switch (acao) {
                case 1:
                    Kart1.piloto.soltaSuperPoder();
                    break;
                case 2:
                    Kart1.pular();
                    break;
                case 3:
                    Kart1.soltarTurbo();
                    break;
                case 4:
                    Kart1.fazerDrift();
                    break;
                case 5:
                    Kart1.motor.mostraInfo();
                    break;
                default:
                    loop = false;
                    break;
            }
        }
        while (loop) ;
        sc.close();
    }
}
