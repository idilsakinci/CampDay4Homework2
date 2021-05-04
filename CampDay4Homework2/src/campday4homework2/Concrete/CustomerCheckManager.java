package campday4homework2.Concrete;

import campday4homework2.Abstarct.CustomerCheckService;
import campday4homework2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        return true;
    }
    
}
