package Abstract;

import Entities.Customer;



public abstract class BaseCostumerManager implements CostumerService {
    @Override
    public void save(Customer customer){
        System.out.println("saved to database: "+customer.getFirstName());
    }
}
