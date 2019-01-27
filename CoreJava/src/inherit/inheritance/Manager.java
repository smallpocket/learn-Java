package inherit.inheritance;

/**
 * @Author : Hyper
 * @Time : 2018/10/17 13:27
 */
public class Manager extends Employee {
    /**
     * 子类继承了父类,拥有父类的字段以及方法
     * 但是子类无法直接访问父类的private字段
     * 因为private字段只有类本身可以访问,尽管子类也拥有属性
     * 但是子类可以通过public的getter方法去获取那些属性的值
     * <p>
     * 子类也可以定义自己的属性字段
     */
    private double bonus;

    /**
     * @param name   the employee's name
     * @param salary the salary
     * @param year   the hire year
     * @param month  the hire month
     * @param day    the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        //调用父类的构造方法
        super(name, salary, year, month, day);
        bonus = 0;
    }

    /**
     * 重写父类的方法
     *
     * @return
     */
    @Override
    public double getSalary() {
        //调用父类的方法,使用super标识
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
