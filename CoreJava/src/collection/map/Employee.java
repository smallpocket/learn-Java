package collection.map;

/**
 * @Author : Heper
 * @Time : 2019/2/3 20:50
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     *
     * @param name the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}
