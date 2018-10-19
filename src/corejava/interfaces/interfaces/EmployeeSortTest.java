package corejava.interfaces.interfaces;

import java.util.Arrays;

/**
 * This program demonstrates the use of the Comparable interface.
 *
 * @Author : Hyper
 * @Time : 2018/10/18 23:30
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        /**
         * 因为重写了ComporeTo方法,所以比较会基于salary
         */
        Arrays.sort(staff);
        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}