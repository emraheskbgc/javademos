import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Aksaray");
        sehirler.add("Aydın");

        sehirler.remove("İstanbul");
        Collections.sort(sehirler);

        for (String i :sehirler){
            System.out.println(i);
        }
    }
}
