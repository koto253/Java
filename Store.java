import java.sql.SQLOutput;

public class Store {
    // instance fields
    String productType;

    // constructor method
    public Store(String product){
        productType = product;
    }

    // advertise method
    public void advertise() {
        System.out.println("Come spend some money!");
        System.out.println("Selling " + productType + "!");
    }

    public static void main(String[] args) {

        Store myProduct = new Store("couscous");

        //output
        myProduct.advertise() ;
        myProduct.advertise() ;
        myProduct.advertise() ;


    }
}