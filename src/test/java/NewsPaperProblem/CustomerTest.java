package NewsPaperProblem;

import org.junit.Test;

import static org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;

public class CustomerTest {

    Customer customer = new Customer();
    NewspaperGuy newspaperGuy = new NewspaperGuy();
    double money = 10.01;

    @Test
    public void testPayForNewspaper() throws Exception {
        double initialCustomerBalance = customer.CheckBalance();
        double initialNPGBalance = newspaperGuy.CheckBalance();
        customer.PayForNewspaper(money, newspaperGuy);
        assertEquals(initialNPGBalance+money, newspaperGuy.CheckBalance(), 0);
        assertEquals(initialCustomerBalance-money, customer.CheckBalance(), 0);
    }

    @Test
    public void testCheckBalance() throws Exception {
        assertEquals(100.00, customer.CheckBalance(), 0);
    }
}