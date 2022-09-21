public class Main {

    public static void main(String[] args) {

        int number = 25;
        int remainder= number % 2;
        System.out.println(remainder);
        System.out.println("-------");
        boolean isPrime=true;

        for (int i=2; i<number; i++){
            if(number %i ==0){
                isPrime=false;

            }

        }if (isPrime){
            System.out.println("Sayı Asal ");
        }
        else
        {
            System.out.println("Sayı ASal Değil");
        }




    }
}
