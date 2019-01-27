package inherit.abstractClass;

/**
 * 这是一个抽象类
 * 这个类并不能被实例化,因为是抽象的,而不是具体的
 * 拥有一个抽象的方法就是抽象类
 *
 * @Author : Hyper
 * @Time : 2018/10/17 15:38
 */
public abstract class Person {
    /**
     * 定义了一个抽象的方法
     *
     * @return
     */
    public abstract String getDescription();

    /**
     * 抽象类也是可以定义属性的
     */
    private String name;

    /**
     * 具体的方法
     *
     * @param name
     */
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
