package org.tata.com;

import java.util.ArrayList;
import java.util.List;

public class OrgBilling extends OrgFunctionalities{
    public OrgBilling(List<Organization> orgList) {
        super(orgList);
    }

    @Override
    void getDiscountonBill(double amount, int id) {
        double total = 0;
        for (Organization o: orgList) {
            if(o.getOrgId() == id && o.getOrgRating() == 'A'){
                total = amount * 1.20;
                System.out.println("For: " + o.getOrgName()+" Discount is 20% on Bill if the rating is 'A' total is: " + total);

            }else if(o.getOrgId() == id && o.getOrgRating() == 'B'){
                total = amount * 1.10;
                System.out.println("For: " + o.getOrgName()+" Discount is 10% on Bill if the rating is 'B' total is: " + total);
            }else if(o.getOrgId() == id && o.getOrgRating() == 'C'){
                total = amount * 1.05;
                System.out.println("For: " + o.getOrgName()+" Discount is 5% on Bill if the rating is 'C' total is: " + total);
            }else{
                System.out.println("For: " + o.getOrgName()+" Discount is 0 total is: " + amount);
            }
        }
    }
}
