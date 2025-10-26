package Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Transactions {
    private String type;

    private double amount;


    // Constructor, getters, and setters


    public Transactions(String type, double amount) {

        this.type = type;

        this.amount = amount;

    }

    public String getType() {

        return type;
    }

    public double getAmount() {

        return amount;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public static void main(String[] args) {
        List<Transactions> lst = List.of(
                new Transactions("deposit", 100.0),

                new Transactions("withdrawal", 50.0),

                new Transactions("deposit", 200.0),

                new Transactions("transfer", 150.0));

        //  filter out transactions of a specific type and collect them into a set 

        String typ = "deposit";
        
        Set<Transactions> filteredTransactions = lst.stream()
                                                 .filter(t -> typ.equals(t.getType()))
                                                 .collect(Collectors.toSet());
        System.out.println("Filtered on deposits = "+ filteredTransactions);

    
        
        





    }
    
}
