package interfaces.interfaces;

/**
 * 实现Comparable接口，基于Employee进行比较
 * implements实现接口
 *
 * @Author : Hyper
 * @Time : 2018/10/18 23:30
 */
public class Employee implements Comparable<Employee> {
    /**
     * 自定义的方法与域
     */
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary，基于奖金进行比较
     * 重写了compareTo，以进行比较排序
     *
     * @param other another Employee object
     * @return a negative value if this employee has a lower salary than
     * otherObject, 0 if the salaries are the same, a positive value otherwise
     */
    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}