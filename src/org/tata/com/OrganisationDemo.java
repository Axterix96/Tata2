package org.tata.com;

import java.util.ArrayList;
import java.util.List;

public class OrganisationDemo {
    public static void main(String[] args) {

        String[] lista = {
         "Positive","Negative","Positive","Negative"
        };

        Organization orga = new Organization(1,"NicolasOrg",2, new String[]{"Positive","Positive","Positive","Positive"});

        List<Organization> o = new ArrayList<>();
        o.add(new Organization(1,"NicolasOrg",2, new String[]{"Positive","Positive","Positive","Positive"}));
        o.add(new Organization(2,"JoseOrg",2, new String[]{"Positive","Negative","Negative","Positive"}));

        OrgBilling ob = new OrgBilling(o);
        ob.getDiscountonBill(20000,1);
        ob.addOrganisation(orga);
        ob.getRating(1);
        ob.getRating(2);
        ob.getOrgList('A');
    }



}
