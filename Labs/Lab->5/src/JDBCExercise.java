import java.util.List;

public class JDBCExercise {

    public static void main(String[] args) {
        
        CustomerDao customerDao = new MySqlCustomerDao();

        Customer customer = customerDao.findCustomerById(347);
        if (customer != null) {
            displayCustomer(customer);
        } else {
            System.out.println("No customer found with customer number 347");
        }

        List<Customer> customers = customerDao.selectCustomersByName("Mini");
        if (!customers.isEmpty()) {
        	for (int i = 0; i < customers.size(); i++) {
        	    displayCustomer(customers.get(i));
        	}
        } else {
            System.out.println("No customers found with name containing 'Mini'");
        }
    }

    private static void displayCustomer(Customer customer) {
        System.out.println("Customer Number: " + customer.getCustomerNumber());
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Contact Last Name: " + customer.getContactLastName());
        System.out.println("Contact First Name: " + customer.getContactFirstName());
        System.out.println("Phone: " + customer.getPhone());
        System.out.println("Address Line 1: " + customer.getAddressLine1());
        System.out.println("Address Line 2: " + customer.getAddressLine2());
        System.out.println("City: " + customer.getCity());
        System.out.println("State: " + customer.getState());
        System.out.println("Country: " + customer.getCountry());
        System.out.println("Sales Rep Employee Number: " + customer.getSalesRepEmployeeNumber());
        System.out.println("Credit Limit: " + customer.getCreditLimit());
        System.out.println("-----break-------");
    }
}


