import java.util.Scanner;
public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Zumbie z1 = new Zumbie();
        z1.nome="Chris";
        z1.vida=150;

        Zumbie z2 = new Zumbie();
        z2.nome="Leon";
        z2.vida=150;

        z1.grito();
        z2.grito();

       sc.close();
    }
}
