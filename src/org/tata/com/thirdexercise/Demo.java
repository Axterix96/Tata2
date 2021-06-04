package org.tata.com.thirdexercise;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Customer> cuList = new ArrayList<>();

        cuList.add(new Customer("Nicolas",1,"3g",1));
        cuList.add(new Customer("Jose",2,"3g",2));


        ArrayList<Account> accList = new ArrayList<Account>();
        accList.add(new Account(600,new Customer("Ramon",3,"3g",1)));

        Operations2 op = new Operations2();
        op.setCustomerList(cuList);
        op.setAccountList(accList);

        op.addCustomer(new Customer("Esthef", 4,"4g",1));

        op.calculateBillandAddAccountsToList(10);
        op.highestAmountPaidUser();
        op.contactUserNames();
    }
}
