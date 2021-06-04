package org.tata.com.thirdexercise;

import java.util.ArrayList;
import java.util.List;

abstract class Operations {
    private List<Customer> customerList;
    private List<Account> accountList;

    public abstract List<Account> highestAmountPaidUser();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public boolean addCustomer(Customer customer) {
        for (Customer cu : customerList) {
            if (cu.getConnectionId() == customer.getConnectionId()) {
                return false;
            }
            break;
        }
        customerList.add(customer);
        System.out.println("Added sucessfully " + customer);
        return true;
    }
    public List<Account> calculateBillandAddAccountsToList(int days){
        int bill = 0;
        for(Account a: accountList){
            if(a.getCustomer().getType().equals("3g") && a.getCustomer().getPlantype() == 1){
               bill = days*50;
               a.setAmountToPay(bill);
            }else if(a.getCustomer().getType().equals("3g") && a.getCustomer().getPlantype() == 2){
                bill = days*75;
                a.setAmountToPay(bill);
            }else if(a.getCustomer().getType().equals("4g") && a.getCustomer().getPlantype() == 1){
                bill = days*70;
                a.setAmountToPay(bill);
            }else {
                bill = days*100;
                a.setAmountToPay(bill);
            }
        }
        return accountList;
    }
}
