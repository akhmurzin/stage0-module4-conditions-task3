package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        float netSalary;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            netSalary = salary * 0.85f;
            System.out.println(netSalary);
        } else if (salary > 10000 && salary <= 20000) {
            netSalary = salary * 0.82f;
            System.out.println(netSalary);
        } else if (salary > 20000) {
            netSalary = salary * 0.8f;
            System.out.println(netSalary);
        }
    }
}
