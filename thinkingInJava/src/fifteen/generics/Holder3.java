package fifteen.generics;

/**
 * 一个持有对象的元组,类似于Result
 * 在这个类当中,有两个可变类,T与E
 *
 * @Author : Heper
 * @Time : 2019/1/28 20:05
 */
public class Holder3<T, E> {

    /**
     * 尽管他们是public的,但是final限制了他们并不能更改
     * 使用public或许还方便调用一些
     * 如果想进行更改,必须通过构造器来更改,即创建一个新的对象
     */
    public final T t;
    public final E e;

    public Holder3(T t, E e) {
        this.t = t;
        this.e = e;
    }

    @Override
    public String toString() {
        return "(" + t + "," + e + ")";
    }
}
