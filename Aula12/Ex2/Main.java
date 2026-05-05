import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<Maeclasse> listamae = new ArrayList<>();

        Filha1 f1 = new Filha1("Ana", 1);
        Filha1 f2 = new Filha1("Bruno", 2);
        Filha2 f3 = new Filha2("Carlos", 3);
        Filha2 f4 = new Filha2("Diana", 4);

        listamae.add(f1);
        listamae.add(f2);
        listamae.add(f3);
        listamae.add(f4);

        Collections.sort(listamae);

        for(int i = 0 ; i < listamae.size() ; i++ )
        {
            System.out.println(listamae.get(i).nome);
        }
    }
    }
