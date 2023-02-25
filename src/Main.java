public class Main {
    public static void main(String[] args) {
        EmployeesBook employeesBook = new EmployeesBook();
        employeesBook.addEmployee(new Employee("Мороз", "Наталья", "Ивановна", 56500, "1"));
        employeesBook.addEmployee(new Employee("Петров", "Илья", "Петрович", 78000, "1"));
        employeesBook.addEmployee(new Employee("Иванов", "Семен", "Семенович", 51000, "2"));
        employeesBook.addEmployee(new Employee("Семенов", "Анатолий", "Иванович", 40000, "2"));
        employeesBook.addEmployee(new Employee("Пик", "Алина", "Константиновна", 55500, "3"));
        employeesBook.addEmployee(new Employee("Крошка", "Максим", "Максимович", 54500, "3"));
        employeesBook.addEmployee(new Employee("Конь", "Ксения", "Борисовна", 53000, "4"));
        employeesBook.addEmployee(new Employee("Жук", "Леонид", "Ильич", 58000, "4"));
        employeesBook.addEmployee(new Employee("Красавина", "Наталья", "Степановна", 54500, "5"));
        employeesBook.addEmployee(new Employee("Крюк", "Петр", "Степанович", 51700, "5"));
        employeesBook.printAllEmployee();
        employeesBook.printAverageSalary();
        System.out.println("Минимальная зарплата: " + employeesBook.getEmployeeWithMinSalary());
        System.out.println("Максимальная зарплата: " + employeesBook.getEmployeeWithMaxSalary());
        employeesBook.printFullName();
    }
}