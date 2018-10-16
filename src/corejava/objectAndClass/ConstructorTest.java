package corejava.objectAndClass;

import java.util.Random;


/**
 * 对象的构造器
 *
 * @Author : Hyper
 * @Time : 2018/10/16 13:15
 */
public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee3[] staff = new Employee3[3];
        staff[0] = new Employee3("Harry", 40000);
        staff[1] = new Employee3(60000);
        staff[2] = new Employee3();

        // print out information about all Employee objects
        for (Employee3 e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
    }
}

class Employee3 {
    private static int nextId;

    private int id;
    // instance field initialization
    private String name = "";
    private double salary;

    //静态初始块
    //会在类第一次加载的时候进行初始化
    //要意识到它是属于类的,所以不会再每一个对象处初始化
    static {
        Random generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    //对象初始化块
    //会在构造器执行前,执行该初始化块
    {
        id = nextId;
        nextId++;
    }

    /**
     * 对构造器进行重载,他们的参数都是不同的
     */

    public Employee3(String n, double s) {
        name = n;
        salary = s;
    }

    public Employee3(double s) {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    /**
     * the default constructor
     */
    public Employee3() {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
}
