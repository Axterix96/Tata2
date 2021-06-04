package org.tata.com.second.exercise;

import java.util.*;

public class EmployeeManagementImpl extends BankEmployee implements EmployeeManagement{
    private HashSet<BankEmployee> employeeSet;

    public EmployeeManagementImpl(int empId, String empName, String branchName, String dept, double salary, boolean permanentCheck) {
        super(empId, empName, branchName, dept, salary, permanentCheck);
    }

    @Override
    public void getSalaryHike() {
        for (BankEmployee ban: employeeSet) {
            if(ban.isPermanentCheck()== true && ban.getSalary()>20000){
                ban.setSalary(20000*1.1);
                System.out.println("New Salary " + ban.getSalary());
            }else if(ban.isPermanentCheck()== false && ban.getSalary()>20000){
                ban.setSalary(20000*1.08);
                System.out.println("New Salary " + ban.getSalary());
            }else{
                ban.setSalary(20000*1.06);
                System.out.println("New Salary " + ban.getSalary());
            }
        }
    }
    public boolean addEmployee(BankEmployee be){
        for (BankEmployee ban: employeeSet) {
            if(!employeeSet.add(ban)){
                System.out.println("Elemento duplicado: " + ban);
                return false;
            }

        }
        System.out.println(employeeSet.size() + "elementos no duplicados" + employeeSet);
        return true;
    }

public Map<Integer, BankEmployee> getEmployee(BankEmployee ban){
Map<Integer, BankEmployee> map = new HashMap<>();
if(ban.getDept()=="Admin") {
    map.put(ban.getEmpId(), ban);
}

return map;
}

public List<BankEmployee> sortPermanentEmployees(List<BankEmployee> ban){
List<BankEmployee> listEmp = new ArrayList<>();
   listEmp.sort(Comparator.comparing(BankEmployee::getEmpId));
        return listEmp;
}

}
