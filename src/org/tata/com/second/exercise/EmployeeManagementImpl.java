package org.tata.com.second.exercise;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeManagementImpl implements EmployeeManagement {
    private HashSet<BankEmployee> employeeSet;

    public HashSet<BankEmployee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(HashSet<BankEmployee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    @Override
    public HashSet<BankEmployee> getSalaryHike() {

        for (BankEmployee ban : employeeSet) {
            if (ban.isPermanentCheck() == true && ban.getSalary() > 20000) {
                ban.setSalary(20000 * 1.1);
                System.out.println("New Salary " + ban.getSalary());
            } else if (ban.isPermanentCheck() == false && ban.getSalary() > 20000) {
                ban.setSalary(20000 * 1.08);
                System.out.println("New Salary " + ban.getSalary());
            } else {
                ban.setSalary(20000 * 1.06);
                System.out.println("New Salary " + ban.getSalary());
            }
            ban.setPermanentCheck(true);

        }
        return employeeSet;
    }

    public boolean addEmployee(BankEmployee be) {
        for (BankEmployee ban : employeeSet) {
            if (ban == be) {
                System.out.println("Already exist: " + ban);
                return false;
            }

        }
        employeeSet.add(be);
        System.out.println(employeeSet.size() + " added " + be);
        return true;
    }

    public Map<Integer, BankEmployee> getEmployee() {
        HashSet<BankEmployee> hash = new HashSet<>();
        for(BankEmployee em: employeeSet) {
            if (em.getDept() == "Admin") {
                hash = employeeSet;
            }
        }
        Map<Integer, BankEmployee> map = hash.stream().collect(Collectors.toMap(x -> x.getEmpId(), x -> x));
        return map;
    }

    public HashSet<BankEmployee> sortPermanentEmployees() {
        List<BankEmployee> listEmp = employeeSet.stream().sorted(Comparator.comparing(BankEmployee::getEmpId)).collect(Collectors.toList());
        for(BankEmployee em : listEmp) {
        if(em.isPermanentCheck()){
            System.out.println("em = " + em);
        }
        }
        HashSet<BankEmployee> h = new HashSet<>();
        h.addAll(listEmp);
        return h;
    }

}
