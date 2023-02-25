import java.util.ArrayList;
import java.util.List;

public class EmployeesBook {
    private static Employee[] employees = new Employee[10];

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println("Нет свободных мест.");
    }
    // Удаление сотрудника.
    public void removeEmployee(String lastName, String name, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && name.equals(employees[i].getName())
                && lastName.equals(employees[i].getLastName())
                && middleName.equals(employees[i].getMiddleName())) {
                employees[i] = null;
                return;
            }
        }
        System.out.println("Работника с такими ФИО не существует.");
    }
    // Вывод списока всех сотрудников со всеми имеющимися по ним данными.
    public void printAllEmployee() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    //Сумма затрат на зарплаты в месяц.
    public double sumSalary() {
        double sum = 0d;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }
    public void printSumSalary() {
        System.out.println(sumSalary());
    }
// Среднее значение зарплат.
    public double averageSalary() {
        double averageSalary = sumSalary()/employees.length;
        return averageSalary;
    }
    public void printAverageSalary() {
        System.out.println("Среднее значение зарплат составляет " + averageSalary());
    }

    public int getFirstNotNullSalaryIndex(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                return i;
            }
            }
            throw new RuntimeException("Нет ни одного работника");
        }

// Сотрудник с минимальной зарплатой.
    public Employee getEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = employees[i];
            }
        }
        return employeeWithMinSalary;
    }
// Сотрудника с максимальной зарплатой.
    public Employee getEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[getFirstNotNullSalaryIndex()];
        for (int i = getFirstNotNullSalaryIndex() + 1; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = employees[i];
            }
        }
        return employeeWithMaxSalary;
    }

    // Список ФИО всех сотрудников.
    public void printFullName (){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees [i];
            System.out.println(employee.getLastName()+ " " + employee.getName() + " " + employee.getMiddleName());
        }
    }
    public void printAllEmployeeByDepartment(String department) {
        for (Employee employee : employees) {
            if (employee != null && department.equals(employee.getDepartment())) {
                System.out.println(employee);
            }
        }
    }
    public void printAllEmployeeGroupDepartment() {
        List<String> departments = findAllDepartment();
        for (String department : departments) {
            System.out.println("В отделе № " + department + " работают следующие сотрудники: ");
            printAllEmployeeByDepartment(department);
        }
    }
    public List<String> findAllDepartment(){
        List<String> allDepartment = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee != null && !allDepartment.contains(employee.getDepartment())) {
                allDepartment.add(employee.getDepartment());
            }
        }
        return allDepartment;
    }
}



