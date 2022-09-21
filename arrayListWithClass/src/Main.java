import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Customer> customers= new ArrayList<Customer>();
        Customer engin=new Customer(1,"Demirog","Engin");
        customers.add(engin);
        customers.add(new Customer(1,"Eskibağcı","Emrah"));
        customers.add(new Customer(1,"Eskibağcı","Osman"));

        customers.remove(engin);

        for (Customer customer:customers){
            System.out.println(customer.firstName);
        }
    }
}
