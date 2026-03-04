import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zumbie z1 = new Zumbie();
        z1.nome = "Chris";
        z1.vida = 150;
        Zumbie z2 = new Zumbie();
        z2.nome = "Leon";
        z2.vida = 150;
        double quantia;

        z1.grito();
        System.out.println(z1.mostraVida());
        z2.grito();
        System.out.println(z2.mostraVida());
        System.out.println("");
        
        do
        {
        System.out.println("Zumbie " + z1.nome + " comeca a tentar transferir vida para Zumbie " + z2.nome + " insira a quantidade de vida");
        quantia = sc.nextDouble();
         }
        while(z1.transfereVida(z2,quantia));

        System.out.println(z1.mostraVida());
        System.out.println(z2.mostraVida());

        sc.close();
    }
}
