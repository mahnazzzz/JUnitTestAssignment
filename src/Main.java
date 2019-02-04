public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        Account ac = new Account(550.4, "Mahnaz");

        System.out.println(main.calculateYearlyInterest(ac));
    }


    public double calculateYearlyInterest(Account account)
    {
        double interest = 0;
        if(account.getBalance() > 0 && account.getBalance() <=100){
            interest = (account.getBalance()/100*3);
            System.out.println("interest is 3%");
        }
        else if(account.getBalance() > 100 && account.getBalance() <1000){
            interest = (account.getBalance()/100*5);
            System.out.println("interest is 5%");
        }
        else if(account.getBalance() > 1000){
            interest = (account.getBalance()/100*7);
            System.out.println("interest is 7%");
        }

        return interest;
    }

}

