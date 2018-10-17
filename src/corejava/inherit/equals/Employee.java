package corejava.inherit.equals;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @Author : Hyper
 * @Time : 2018/10/17 13:27
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * 更改判定类相等的方法
     * 更改了equals类,最好也改hashCode方法,
     * 猜测:因为hashCode方法计算对象存储地址,也是一个判定是否相等的依据
     *
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        // a quick test to see if the objects are identical
        if (this == otherObject) return true;

        // must return false if the explicit parameter is null
        if (otherObject == null) return false;

        // if the classes don't match, they can't be equal
        if (getClass() != otherObject.getClass()) return false;

        // now we know otherObject is a non-null Employee
        Employee other = (Employee) otherObject;

        // test whether the fields have identical values
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    /**
     * 使用Object.hash方法
     * 记得是能返回一个比较好的hash值
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    /**
     * 改写toString方法,更好地反应这个类
     *
     * @return
     */
    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay
                + "]";
    }
}
