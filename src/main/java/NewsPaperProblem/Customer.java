package NewsPaperProblem;

public class Customer {
    Wallet wallet=new Wallet();

    public Customer(){
        wallet.AddCash(100.00);
    }

    public void PayForNewspaper(double money, NewspaperGuy newspaperGuy){
        wallet.WithdrawCash(money);
        newspaperGuy.Collect(money);
    }

    public double CheckBalance(){
        return wallet.Balance();
    }
}

