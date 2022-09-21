public class Main {

    public static void main(String[] args) {

       int[] sayilar = new int[]{1,9
               ,4,6,8};

       int enBuyukSayi=sayilar[0];

       for (int sayi:sayilar)
       {
           if (enBuyukSayi<sayi){
               enBuyukSayi=sayi;
           }
       }
        System.out.println(enBuyukSayi);
    }
}
