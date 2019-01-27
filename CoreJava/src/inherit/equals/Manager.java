package inherit.equals;

/**
 * @Author : Hyper
 * @Time : 2018/10/17 13:27
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 先进行父类的equals判断
     *
     * @param otherObject
     * @return
     */
    @Override
    public boolean equals(Object otherObject) {
        //首先父类的equal要通过
        //因为子类是基于父类的,子类拥有父类的
        //所以如果通过了子类的equals判断,则一定可以通过父类的
        if (!super.equals(otherObject)) return false;
        Manager other = (Manager) otherObject;
        // super.equals checked that this and other belong to the same class
        return bonus == other.bonus;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), bonus);
    }

    /**
     * 子类的toString方法先调用一下父类的方法
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString() + "[bonus=" + bonus + "]";
    }
}

