import java.util.*;
import java.lang.Override;
public class Q19{
    public static void main(String[] args){
         List<Employee> employeeList = new ArrayList<>();
         employeeList.add(new PartTimeEmployee(23,"Dablu",80000));
         employeeList.add(new FullTimeEmployee(28,"Bablu",80000));
         System.out.println(employeeList.get(0));
         System.out.println(employeeList.get(1));
    }
}
class Employee{
    protected int id;
    protected String name;
    protected int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class FullTimeEmployee extends Employee{
    public FullTimeEmployee(int id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @java.lang.Override
    public void setSalary(int salary) {
        super.setSalary((int)(salary*0.95));
    }
}
class PartTimeEmployee extends Employee{
    public PartTimeEmployee(int id, String name, int salary) {
        super(id, name, salary);
        setSalary(salary);
    }

    @java.lang.Override
    public void setSalary(int salary) {
        super.setSalary((int)(salary*0.85));
    }
}