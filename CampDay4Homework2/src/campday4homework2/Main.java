package campday4homework2;

import campday4homework2.Abstarct.BaseCustomerManager;
import campday4homework2.Concrete.CustomerCheckManager;
import campday4homework2.Concrete.NeroCustomerManager;
import campday4homework2.Concrete.StarbucksCustomerManager;
import campday4homework2.Entities.Customer;

public class Main {

    public static void main(String[] args) {
        
        BaseCustomerManager customerManager=new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1, "İdil", "Sakıncı", "2000", "12345678910"));
    }
    
}
