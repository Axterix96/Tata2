package org.tata.com;

import java.util.ArrayList;
import java.util.List;

abstract class OrgFunctionalities {
    protected List<Organization> orgList;

    public OrgFunctionalities(List<Organization> orgList) {
        this.orgList = orgList;
    }

    public boolean addOrganisation(Organization org) {
        boolean boo = false;
        for (Organization o : orgList) {

            if (org.getOrgId() == o.getOrgId()) {
                System.out.println("This organization already exist");
                return boo = false;
            } else {
                orgList.add(org);
                System.out.println("Added succesfully");
                return boo = true;
            }

        }
        return boo;
    }



    public Organization getRating(int id) {
        Organization org = null;
        for (Organization o : orgList) {
            System.out.println(o.getOrgId()+" "+ id);
            if (o.getOrgId() == id) {

                String[] status = o.getFinancialStatus();
                int cont = 0;
                for(String one : status){

                    if(one.equals("Positive")){
                        cont++;
                    }
                }
                if (cont == 3) {
                o.setOrgRating('A');
                org = o;
                } else if (cont >=1) {
                    o.setOrgRating('B');
                    org = o;
                }else{
                    o.setOrgRating('C');
                    org = o;
                }

            } else {
                System.out.println("No se encuentra esa organizacion");
                break;
            }
        }
        return org;
    }

    public List<Organization> getOrgList(char rat){
        List<Organization> newo = new ArrayList<>();
        for (Organization o : orgList) {
            if(o.getOrgRating() == rat){
                newo.add(o);
            }

        }
        return newo;
    }
     abstract void getDiscountonBill(double amount, int id);

}
