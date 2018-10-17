package corejava.inherit.arraylist;

import java.util.ArrayList;

/**
 * This program demonstrates the ArrayList class.
 *
 * @Author : Hyper
 * @Time : 2018/10/17 23:10
 */
public class ArrayListTest {
    public static void main(String[] args) {
        // fill the staff array list with three Employee objects
        //在ArrayList使用泛型
        ArrayList<Employee> staff = new ArrayList<>();

        /**
         * add方法
         * remove方法
         * set方法
         * get方法
         */
        staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));

        // raise everyone's salary by 5%
        for (Employee e : staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="
                    + e.getHireDay());
    }
}