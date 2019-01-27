package ten.innerClass;


/**
 * 与外部类的链接交互
 * 通过这个内部类,可以实现对数组访问操作的统一,亦或者是对类内部对象、数据等对象的统一操作接口
 *
 * @Author : Heper
 * @Time : 2019/1/26 16:53
 */
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) { items = new Object[size]; }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
    }

    /**
     * 这个是内部类,也是一个迭代器
     */
    private class SequenceSelector implements Selector {
        private int i = 0;
        /**
         * 在该方法当中,直接使用到了外围类的items,不需要任何的中介
         */
        @Override
        public boolean end() { return i == items.length; }
        @Override
        public Object current() { return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    /**
     * 返回一个内部类的引用
     */
    public Selector selector() {
        return new SequenceSelector();
    }
    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        //设计模式的思想,只要是继承了selector接口的,都可以使用这个迭代器
        //想要创建一个内部类的对象,必须通过它的外部类来实现
        Selector selector = sequence.selector();
        while(!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}

/**
 * 一个通用的接口
 */
interface Selector {
    boolean end();
    Object current();
    void next();
}