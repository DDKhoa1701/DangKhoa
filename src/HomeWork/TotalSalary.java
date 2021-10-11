package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class TotalSalary {


    public static void main(String[] args) {
        CEO president = new CEO();
        Manager leader = new Manager();
        StandardEmployee member = new StandardEmployee();
        StandardEmployee member1 = new StandardEmployee();

        double totalSalaries = 0.0;
        //List Employee
        List<Employee> employees = new ArrayList<>();
        employees.add(president);
        employees.add(leader);
        employees.add(member);
        employees.add(member1);
        TotalSalary salary = new TotalSalary();
        totalSalaries = salary.sumSalaries(employees);
        System.out.printf("Total Salary -> %f", totalSalaries);

    }

    //Calculator Salary
    public double sumSalaries(List<Employee> employees) {
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.getSalary() + employee.getSupportSalary() + employee.getVIP();
        }
        return totalSalaries;
    }
}
