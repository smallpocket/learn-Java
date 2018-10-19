package corejava.interfaces.clone;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 实现克隆,Cloneable接口
 *
 * @Author : Hyper
 * @Time : 2018/10/19 16:09
 */
public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    /**
     * 实现克隆接口,进行重写
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Employee clone() throws CloneNotSupportedException {
        // call Object.clone()
        Employee cloned = (Employee) super.clone();

        // clone mutable fields
        //进行深层次的克隆,因为对象本身含有对其他对象的引用,所以要如此
        cloned.hireDay = (Date) hireDay.clone();

        return cloned;
    }

    /**
     * Set the hire day to a given date.
     *
     * @param year  the year of the hire day
     * @param month the month of the hire day
     * @param day   the day of the hire day
     */
    public void setHireDay(int year, int month, int day) {
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();

        // Example of instance field mutation
        hireDay.setTime(newHireDay.getTime());
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "Employee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}