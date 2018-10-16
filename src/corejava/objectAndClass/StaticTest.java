package corejava.objectAndClass;

/**
 * @Author : Hyper
 * @Time : 2018/10/16 12:48
 */
public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        Employee1[] staff = new Employee1[3];

        staff[0] = new Employee1("Tom", 40000);
        staff[1] = new Employee1("Dick", 60000);
        staff[2] = new Employee1("Harry", 65000);

        // for each语法
        //for(类名 变量 ：数组或list等)
        for (Employee1 e : staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
        }
        // 调用静态方法，要使用类名去调用
        int n = Employee1.getNextId();
        System.out.println("Next available id=" + n);
    }
}

/**
 * 在一个类文件创建多个类
 */
class Employee1 {
    //静态域
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee1(String n, double s) {
        name = n;
        salary = s;
        id = 0;
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

    public void setId() {
        // 静态域是共享的
        id = nextId;
        nextId++;
    }

    public static int getNextId() {
        // 可以用于返回当前的总人数
        return nextId;
    }

    public static void main(String[] args) // unit test
    {
        Employee1 e = new Employee1("Harry", 50000);
        Employee1 d = new Employee1("Harry", 50000);
        System.out.println(e.getId());
        System.out.println(e.getName() + " " + e.getSalary());
    }
}

