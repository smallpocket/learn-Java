package fifteen.generics;

import eleven.collection.Pet;

/**
 * 编写一个通用类的尝试
 *
 * @Author : Heper
 * @Time : 2019/1/28 19:05
 */
public class Holder {

    /**
     * 持有一个Object的类,对它进行处理
     * 但是,如此一来,并不能持有一个其他的类,必须要进行向上转型
     * 如果说,想要持有一个新的类,就又要写一个新的类
     * 使用泛型可以帮助解决这种问题
     */
    private Object a;


    public Holder(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        Holder h2 = new Holder(new Pet());
        Pet a = (Pet) h2.get();
        h2.set("Not an Automobile");
        String s = (String) h2.get();
        h2.set(1);
        Integer x = (Integer) h2.get();
    }
}
