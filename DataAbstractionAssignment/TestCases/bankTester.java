import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class bankTester {
    Customer case1;
    Customer case2;
    Customer case3;
    Customer case4;
    Customer case5;

    Deposit deposit1;
    Deposit deposit2;
    Deposit deposit3;
    Withdraw withdraw1;
    Withdraw withdraw2;
    Withdraw withdraw3;

    @Before
    public void setUp() {
        case1 = new Customer("John", 1000, 1000);
        case2 = new Customer("Katie", 600, 0);
        case3 = new Customer("Ramsey", 12.5, 10.50);
        case4 = new Customer("Holly", -90, -100);
        case5 = new Customer("Parker", 10^100000000, -10^1000000000);

        deposit1 = new Deposit(100.0, 1000.0, "Saving");
        deposit2 = new Deposit(-1, -1, "Checking");
        deposit3 = new Deposit(24, 110, "Neither");

        withdraw1 = new Withdraw(5, -95, "Checking");
        withdraw2 = new Withdraw(-100.04, 45.29, "Saving");
        withdraw3 = new Withdraw(654321.98, 123456.78, "Checking");
    };

    @Test
    public void testDeposit() {
        assertEquals(1010.21, case1.deposit(10.21, "Checking"));
        assertEquals(0.0, case2.deposit(-4, "Saving"));
        assertEquals(0.0, case3.deposit(-10^1000000000, "Checking"));
        assertEquals(0.0, case4.deposit(5.5, "Neither"));
        assertFalse((10^100000000) > case5.deposit(1, "Checking"));
    };

    @Test
    public void testWithdraw() {
        assertEquals(0.0, case1.withdraw(-68.9, "Saving"));
        assertTrue(-100 > case2.withdraw(100.01, "Saving"));
        assertFalse(-1 < case3.withdraw(10^123456789, "Checking"));
        assertTrue(0.1 > case4.withdraw(-0.0, "Saving"));
        assertFalse(1 > case5.withdraw((10^100000000-2^10000000), "Checking"));

    };

    @Test
    public void testDepositString() {
        assertTrue(deposit1.toString().contains("1000.0"));
        assertFalse(deposit2.toString().contains("-1"));
        assertFalse(deposit3.toString().contains("10.0"));
    };

    @Test
    public void testWithdrawString() {
        assertTrue(withdraw1.toString().contains("-95.0"));
        assertFalse(withdraw2.toString().contains("45.29"));
        assertTrue(withdraw3.toString().contains("654321.98"));
    };
}
