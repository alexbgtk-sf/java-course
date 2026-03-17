/**
 * @author alexandrabogatko
 * @date 17/03/2026 4:20 pm
 */

public class CreditCard {
    String accountNumber;
    Double currentAmount;
    String cardHolder;
    CreditCard(String accountNumber, Double currentAmount, String cardHolder) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
        this.cardHolder = cardHolder;
    }
    void printAccountNumber() {
        System.out.println("Credit card number " + (cardHolder) + ": " + (accountNumber));
    }
    void printCurrentAmount() {
        System.out.println((cardHolder) + "'s amount: " + (currentAmount));
    }
    double addAmount() {
        double randomAmount = Math.random() * 1000;
        currentAmount += randomAmount;
        //currentAmount = (double) Math.round(currentAmount);
        return randomAmount;
    }
    double cashOut () {
        double randomAmount = Math.random() * 1000;
        currentAmount -= randomAmount;
        //currentAmount = (double) Math.round(currentAmount);
        return randomAmount;
    }
    void printCardInfo () {
        System.out.println((cardHolder) + "'s " + "credit card number: " + accountNumber + "," + " current amount: " + currentAmount);
    }

}