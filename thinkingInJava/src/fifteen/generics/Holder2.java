package fifteen.generics;

import eleven.collection.Pet;

/**
 * 基于泛型对类的复用性进行扩展
 *
 * @Author : Heper
 * @Time : 2019/1/28 19:59
 */
public class Holder2<T> {
    /**
     * 可以看到,这个类从Object变成了T
     * 即一个可以在编译时更改的类,则在创建对象时候,只需要指明类型即可
     */
    private T a;

    public Holder2(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        //创建对象时候,要指明T的类型
        Holder2<Pet> h3 =
                new Holder2<>(new Pet());
        Pet a = h3.get(); // No cast needed
        // h3.set("Not an Automobile"); // Error
        // h3.set(1); // Error
    }
}
