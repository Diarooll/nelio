public class Main{
    static void main(String[] args) {
        Account acc = new Account(1001, "Diego", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "alejandro", 0.0, 500);

        //upCasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "nao sei", 0.0, 400);
        Account acc3 = new SavingsAccount(1004, "nbaose", 40, 0.01);

        // downcasting

        BusinessAccount acc4 =(BusinessAccount) acc2;
        acc4.loan(100);

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            System.out.println("é business");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
        }
    }
}