package NewsPaperProblem;

public class NewspaperGuy{

    Wallet wallet = new Wallet();

    public void Collect(double money){
        wallet.AddCash(money);
    }

    public double CheckBalance(){
        return wallet.Balance();
    }
}
