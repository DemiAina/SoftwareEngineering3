import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlCustomerDao implements CustomerDao {

    private Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }

    @Override
    public List<Customer> selectCustomersByName(String name) {
        List<Customer> customers = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            String query = "SELECT * FROM customer WHERE customerName LIKE '" + name + "%' ORDER BY customerName";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                Customer customer = new Customer();
                populateCustomerFields(rs, customer);
                customers.add(customer);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer findCustomerById(int customerNumber) {
        Customer customer = null;
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            String query = "SELECT * FROM customer WHERE customerNumber = " + customerNumber;
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                customer = new Customer();
                populateCustomerFields(rs, customer);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    private void populateCustomerFields(ResultSet rs, Customer customer) throws SQLException {
        customer.setCustomerNumber(rs.getInt("customerNumber"));
        customer.setCustomerName(rs.getString("customerName"));
        customer.setContactLastName(rs.getString("contactLastName"));
        customer.setContactFirstName(rs.getString("contactFirstName"));
        customer.setPhone(rs.getString("phone"));
        customer.setAddressLine1(rs.getString("addressLine1"));
        customer.setAddressLine2(rs.getString("addressLine2"));
        customer.setCity(rs.getString("city"));
        customer.setState(rs.getString("state"));
        customer.setCountry(rs.getString("country"));
        customer.setSalesRepEmployeeNumber(rs.getInt("salesRepEmployeeNumber"));
        customer.setCreditLimit(rs.getInt("creditLimit"));
    }
}


