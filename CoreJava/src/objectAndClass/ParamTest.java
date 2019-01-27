package objectAndClass;

/**
 * 检验按引用传递与按值传递
 *
 * @Author : Hyper
 * @Time : 2018/10/16 13:15
 */
public class ParamTest {
    public static void main(String[] args) {
        /*
         * 测试 1: 方法并不能改变变量的值
         */
        System.out.println("Testing tripleValue:");
        double percent = 10;
        System.out.println("Before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);

        /**
         * 测试 2: 方法可以改变对象的状态
         * 因为传递的是对对象的引用，所以一份拷贝也是指向原有的对象
         */
        System.out.println("\nTesting tripleSalary:");
        Employee2 harry = new Employee2("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        /*
         * Test 3: 方法无法将对象绑定到一个对象参数上
         */
        System.out.println("\nTesting swap:");
        Employee2 a = new Employee2("Alice", 70000);
        Employee2 b = new Employee2("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        //该方法无法改变对象的引用
        swap(a, b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void tripleValue(double x) // doesn't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(Employee2 x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    /**
     * 实际上改变了引用的是方法里面的两个拷贝,而拷贝在方法结束之后释放了
     *
     * @param x
     * @param y
     */
    public static void swap(Employee2 x, Employee2 y) {
        Employee2 temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x=" + x.getName());
        System.out.println("End of method: y=" + y.getName());
    }
}

class Employee2 // simplified Employee class
{
    private String name;
    private double salary;

    public Employee2(String n, double s) {
        name = n;
        salary = s;
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
}

