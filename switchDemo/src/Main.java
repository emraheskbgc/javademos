public class Main {

    public static void main(String[] args) {

        char grade = 'T';

        switch (grade) {
            case 'A':
                System.out.println("Not A");
                break;
            case 'B':
                System.out.println("Not B");
                break;
            case 'C':
                System.out.println("Not C");
                break;
            case 'D':
                System.out.println("Not D");
                break;
            case 'F':
                System.out.println("Not F");
                break;
            default:
                System.out.println("Geçersiz Not");
                break;
        }


    }
}
