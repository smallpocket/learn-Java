package fifteen.generics;

/**
 * 泛型方法
 *
 * @Author : Heper
 * @Time : 2019/2/2 17:10
 */
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();
        /**
         * 对f方法的重载
         * 编译器自动根据参数的类型进行重载
         */
        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
}
