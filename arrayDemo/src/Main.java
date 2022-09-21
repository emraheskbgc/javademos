public class Main {

    public static void main(String[] args) {

        String ogrenci1="Engin";
        String ogrenci2 ="Derin";
        String ogrenci3="Emrah";

        String[] ogrenciler = new String[]{ogrenci1,ogrenci2,ogrenci3};


        for (int i=0; i<ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);

        }
        for (String ogrenci : ogrenciler)
        {
            System.out.println(ogrenci);
        }
    }
}
