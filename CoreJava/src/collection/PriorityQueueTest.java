package collection;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * 运行中的优先级队列
 * 并不是按照元素的排列顺序访问的,而删除却总是删掉剩余元素中优先级数最小的那个元素
 *
 * @Author : Heper
 * @Time : 2019/2/3 19:35
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
        pq.add(LocalDate.of(1815, 12, 10)); // A. Lovelace
        pq.add(LocalDate.of(1903, 12, 3)); // J. von Neumann
        pq.add(LocalDate.of(1910, 6, 22)); // K. Zuse

        System.out.println("Iterating over elements...");
        for (LocalDate date : pq) {
            System.out.println(date);
        }
        System.out.println("Removing elements...");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
