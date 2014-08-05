package NewsPaperProblem;

import com.sun.javaws.exceptions.InvalidArgumentException;

 class Wallet {
    private double Money;

    protected void AddCash(double money)throws IllegalArgumentException{
        if(money < 0.0){
            throw new IllegalArgumentException("Enter correct amount!");
        }
        Money += money;
    }

    protected void WithdrawCash(double money) throws IllegalArgumentException{
        if (money > Money){
            throw new IllegalArgumentException("Insufficient Fund!");
        }
        Money -= money;
    }

     public double Balance() {
         return Money;
     }
 }
