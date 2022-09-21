import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String str="H3ello99";

        Pattern desen=Pattern.compile("[0-9]+");
        Matcher eslesme=desen.matcher(str);
        int total=0;
        while(eslesme.find()){

            int sayilar=Integer.parseInt(eslesme.group());
            total+=sayilar;
        }
        System.out.println(total);
    }
}
