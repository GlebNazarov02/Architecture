package dz4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CashProvider {
    private List<Customer> customers;
    private double card;
    private double hashCard;
    private boolean isAuthorization;

    public CashProvider(double card,double hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = true;
    }
    public boolean authorization(int id) {
        for (Customer customer: customers){
            if (customer.getId() == id) {
                isAuthorization = true;
                return isAuthorization;
            } 
        }
        return isAuthorization;    
    }

    public void buy() {
        if (isAuthorization && cardHasFunds()) {
            card -= hashCard;
        } else {
            System.out.println("недостаточно средств");;
        }
    }

    public boolean cardHasFunds() {
        if (card >= hashCard){
            return true;
        }
        return false; 
    }

    @Override
    public String toString() {
        return "Customer{" +
                "card" + card +
                ", hashcard=" + hashCard+
                '}';
    }
}