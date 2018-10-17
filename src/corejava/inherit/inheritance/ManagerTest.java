package corejava.inherit.inheritance;

/**
 * @Author : Hyper
 * @Time : 2018/10/17 13:27
 */
public class ManagerTest {
    public static void main(String[] args) {
        // construct a Manager object
        Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        // fill the staff array with Manager and Employee objects

        //尽管boss是一个Manager,但是它也是一个Employee,所以是可以被引用的
        //当然,如果这是一个子类的引用,例如Manager m = new Employee()
        //这是绝对不允许的,因为Employee未必是一个Manager
        staff[0] = boss;
        staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);
        staff[2] = new Employee("Tommy Tester", 40000, 1990, 3, 15);

        // print out information about all Employee objects
        for (Employee e : staff) {
            // 虽然这里看上去都是Employee,但是,实际上,staff[0]真正引用的对象是一个子类,
            // 所以调用的方法是子类的方法
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
