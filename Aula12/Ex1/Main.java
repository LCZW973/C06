import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public  class Main {

    public static void main(String[] args)
    {
        List<Double> lista = new ArrayList<Double>();

        lista.add(4.00);
        lista.add(1.00);
        lista.add(3.00);
        lista.add(2.00);
        lista.add(7.00);

        Collections.sort(lista,Collections.reverseOrder());

        for(double indice : lista)
        {
            System.out.println(indice);
        }
    }

}
