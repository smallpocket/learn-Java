package eleven.collection;

import java.util.*;

/**
 * 对集合添加一组元素
 *
 * @Author : Heper
 * @Time : 2019/1/28 14:58
 */
public class AddingGroups {
    public static void main(String[] args) {
        //ArrayList向上转型,将对象赋予一个Collection引用
        //Arrays.asList返回一个List的接口,接口由底层进行实现
        //,由于底层实现该接口的是数组,因此,这个List是不能进行add或者remove的操作的
        Collection<Integer> collection =
                new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        //建立一个数组
        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        // Runs significantly faster, but you can't
        // construct a Collection this way:
        Collections.addAll(collection, 11, 12, 13, 14, 15);
        Collections.addAll(collection, moreInts);
        // 对于这个list,就是不可以进行add操作的
        List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
        // OK -- modify an element
        list.set(1, 99);
        // list.add(21); // 会导致运行时错误
        // 底层是数组underlying array cannot be resized.
    }
} ///:~