import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.name="mouse";
        product.price=10;
        manager.add(product);

        DatabaseHelper.Crud.Delete();
        DatabaseHelper.Connection.createConnection();
    }
}