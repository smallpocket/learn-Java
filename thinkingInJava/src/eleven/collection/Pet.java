package eleven.collection;

/**
 * 做一个具体的对象,添加到集合当中
 *
 * @Author : Heper
 * @Time : 2019/1/28 15:47
 */
public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }


    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
