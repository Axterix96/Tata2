package org.tata.com.thirdexercise;

import java.util.Comparator;
import java.util.List;

public class Operations2 extends Operations{
    public List<Account> highestAmountPaidUser(){
        Account aux = getAccountList().stream()
                .max( Comparator.comparing(o -> o.getAmountToPay()))
                .get();

        System.out.println(aux.getCustomer().getUserName());

return null;
    }

    public void contactUserNames() {
        String one = ":";
        String two = ":";
        for(Account aux: getAccountList()) {
            if( aux.getCustomer().getType() == "3g") {
                one += aux.getCustomer().getUserName() + "";
            }else {
                two += aux.getCustomer().getUserName()+" ";
            }
        }

        System.out.println(one+":"+two);
    }

}
