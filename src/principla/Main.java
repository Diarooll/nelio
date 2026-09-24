package principla;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main{
    static void main(String[] args) {
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount("diego", 1000, 500, 300));
        list.add(new BusinessAccount("diego", 1002, 400, 0.01));
        list.add(new BusinessAccount("diego", 1006, 200, 0.01));
        list.add(new SavingsAccount("diego", 1005, 300, 300));

        double sum = 0.0;

        for(Account account: list){
            sum += account.getBalance();
        }
        System.out.printf("Sum of balance: R$ %.2f\n\n", sum);

        for(Account acc : list){
            System.out.printf("Balance before deposit: $%.2f\n", acc.getBalance());
            acc.deposit(10.0);
            System.out.printf("Balance after deposit: $%.2f\n\n", acc.getBalance());

        }


    }
}