package org.tata.com.second.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class BankDemo {
    public static void main(String[] args) {
        HashSet<BankEmployee> employeeSet = new HashSet<>();

        employeeSet.add(new BankEmployee(1, "Nicolas", "Sogbi", "Admin", 21000, true));
        employeeSet.add(new BankEmployee(2, "Jose", "Sogbi", "Rh", 19000, false));

        for (BankEmployee ban : employeeSet) {
            System.out.println("ban = " + ban);
        }

        EmployeeManagementImpl imp = new EmployeeManagementImpl();
        imp.setEmployeeSet(employeeSet);
        imp.getSalaryHike();
        imp.addEmployee(new BankEmployee(3, "Rodriguez", "Sogbi", "Rh", 19000, false));
       HashMap<Integer,BankEmployee> h = (HashMap<Integer, BankEmployee>) imp.getEmployee();
        System.out.println(Arrays.asList(h));
        imp.sortPermanentEmployees();
    }
}
