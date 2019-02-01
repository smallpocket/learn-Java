package fifteen.generics;

/**
 * 基于泛型构造一个链表
 *
 * @Author : Heper
 * @Time : 2019/2/1 21:32
 */
public class LinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        /**
         * 这个不需要加<>
         *
         * @param data
         * @param next
         */
        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public Node() {
            data = null;
            next = null;
        }
    }

    /**
     * 头结点
     * 不是属性,作为一个对象引用,要分配相应的空间
     */
    private Node<T> head = new Node<>();

    public void add(T data) {
        if (head.next == null) {
            head.next = new Node<>(data, null);
        } else {
            Node<T> node = new Node<>(data, head.next);
            head.next = node;
        }
    }

    /**
     * 获得元素
     */
    public T pop(Node<T> node) {
        return node.data;
    }

    public static void main(String args[]) {
        LinkedList<String> linkedList = new LinkedList<>();
        for (String s : "Phasers on stun!".split(" ")) {
            linkedList.add(s);
        }
        String s;
        Node<String> last = linkedList.head.next;
        while ((s = last.data) != null) {
            System.out.println(s);
            if (last.next == null) {
                break;
            }
            last = last.next;
        }
    }
}
