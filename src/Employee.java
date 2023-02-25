import java.util.Objects;

public class Employee {
    private String lastName;
    private String name;
    private String middleName;
    private double salary;
    private String department;
    private final long id = count;
    private static long count = 1L;

    public Employee(String lastName, String name, String middleName, double salary, String department) {
        this.lastName = lastName;
        this.name = name;
        this.middleName = middleName;
        this.salary = salary;
        if (Utilit.isDepartment(department)) {
            this.department = department;
        } else {
            System.out.println("Такого отдела нет.");
        }
        count++;
    }

        public String getLastName () {
            return lastName;
        }

        public String getName () {
            return name;
        }

        public String getMiddleName () {
            return middleName;
        }

        public double getSalary () {
            return salary;
        }

        public String getDepartment () {
            return department;
        }

        public long getId () {
            return id;
        }

        public static long getCount () {
            return count;
        }

        public void setSalary ( double salary){
            this.salary = salary;
        }

        public void setDepartment (String department){
            this.department = department;
        }

        @Override
        //ЛНР - личный номер работника.
        public String toString () {
            return "ЛНР № " + id + ", ФИО: " + lastName + " " + name + " " + middleName + " работает в отделе: "
                    + department + ", получает зарплату: " + String.format("%.2f", salary);
        }

        @Override
        public boolean equals (Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return id == employee.id;
        }

        @Override
        public int hashCode () {
            return Objects.hash(id);
        }
    }
