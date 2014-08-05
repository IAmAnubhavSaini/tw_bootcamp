package NewsPaperProblem;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class WalletTest {

    Wallet wallet = new Wallet();

    @Test
    public void testAddCash() {
        wallet.AddCash(10.01);
        assertEquals(10.01, wallet.Balance(), 0);
    }

    @Test
    public void testWithdrawCash() throws Exception {
        wallet.AddCash(10.01);
        wallet.WithdrawCash(0.01);
        assertEquals(10.00, wallet.Balance(), 0);
    }

    @Test
    public void testBalance() throws Exception {
        wallet.AddCash(10.01);
        wallet.WithdrawCash(0.01);
        assertEquals(10.00, wallet.Balance(), 0);
    }
}