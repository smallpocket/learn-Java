package ten.innerClass;

/**
 * 在内部类当中获得对外部类的引用
 *
 * @Author : Heper
 * @Time : 2019/1/26 17:25
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        /**
         * 获得对外部类的引用,使用外部类的名称,后加.this
         *
         * @return
         */
        public DotThis outer() {
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
