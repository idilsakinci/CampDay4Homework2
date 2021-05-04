package campday4homework2.Concrete;

import campday4homework2.Abstarct.BaseCustomerManager;
import campday4homework2.Abstarct.CustomerCheckService;
import campday4homework2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    
    private CustomerCheckService customerCheckService;
     
    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }
    
    @Override
    public void save(Customer customer) {
       if (customerCheckService.checkIfRealPerson(customer)) {
           super.save(customer);
       }
       else
           throw new RuntimeException("Invalid person!");
    }
    
}
