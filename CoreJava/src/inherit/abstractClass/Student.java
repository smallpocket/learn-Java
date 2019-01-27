package inherit.abstractClass;

/**
 * @Author : Hyper
 * @Time : 2018/10/17 15:39
 */
public class Student extends Person {
    private String major;

    /**
     * @param name  the student's name
     * @param major the student's major
     */
    public Student(String name, String major) {
        // pass n to superclass constructor
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}
