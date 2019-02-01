package fifteen.generics;

/**
 * 实现一个堆栈
 *
 * @Author : Heper
 * @Time : 2019/2/1 21:28
 */
public class LinkedStack<T> {
    private static class Node<U> {
        /**
         * 数据
         */
        U item;
        /**
         * 链接的下一个对象
         */
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>(); // End sentinel

    public void push(T item) {
        top = new Node<>(item, top);
    }

    /**
     * 出栈
     *
     * @return 栈顶元素
     */
    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on stun!".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
