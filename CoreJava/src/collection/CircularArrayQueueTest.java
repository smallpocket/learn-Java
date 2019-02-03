package collection;

import java.util.*;

/**
 * @Author : Heper
 * @Time : 2019/2/2 18:02
 */
public class CircularArrayQueueTest {
    public static void main(String[] args) {
        Queue<String> q = new CircularArrayQueue<>(5);
        q.add("Amy");
        q.add("Bob");
        q.add("Carl");
        q.add("Deedee");
        q.add("Emile");
        q.remove();
        q.add("Fifi");
        q.remove();
        for (String s : q) {
            System.out.println(s);
        }
    }
}

/**
 * A first-in, first-out bounded collection.
 * 一个自定义的队列,继承抽象接口,基于泛型
 */
class CircularArrayQueue<E> extends AbstractQueue<E> {
    /**
     * 基于数组实现
     */
    private Object[] elements;
    private int head;
    private int tail;
    private int count;
    private int modcount;

    /**
     * 新建一个空队列
     *
     * @param capacity 即队列的长度 the maximum capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        elements = new Object[capacity];
        count = 0;
        head = 0;
        tail = 0;
    }

    /**
     * 根据数组长度与实际长度判断是否允许插入新元素
     *
     * @param newElement
     * @return
     */
    @Override
    public boolean offer(E newElement) {
        assert newElement != null;
        if (count < elements.length) {
            elements[tail] = newElement;
            tail = (tail + 1) % elements.length;
            count++;
            modcount++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return
     */
    @Override
    public E poll() {
        if (count == 0) {
            return null;
        }
        E r = peek();
        head = (head + 1) % elements.length;
        count--;
        modcount++;
        return r;
    }

    /**
     * @return 返回头结点
     */
    @Override
    public E peek() {
        if (count == 0) {
            return null;
        }
        return (E) elements[head];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();

    }

    /**
     * 设计的一个迭代器
     */
    private class QueueIterator implements Iterator<E> {
        private int offset;
        private int modcountAtConstruction;

        public QueueIterator() {
            //内部类,直接使用外部类的字段
            modcountAtConstruction = modcount;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E r = (E) elements[(head + offset) % elements.length];
            offset++;
            return r;
        }

        @Override
        public boolean hasNext() {
            if (modcount != modcountAtConstruction) {
                throw new ConcurrentModificationException();
            }
            return offset < count;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
