package eleven.collection;

import java.util.LinkedList;

/**
 * 尝试List的API
 *
 * @Author : Heper
 * @Time : 2019/1/28 15:46
 */
public class ListTrain {
    public static void main(String[] args) {
        //新建一个LinkedList
        LinkedList<Pet> pets = new LinkedList<>();
        Pet dog = new Pet("dog");
        //添加
        pets.add(new Pet("cat"));
        pets.add(dog);
        pets.add(new Pet("rubby"));
        pets.add(new Pet("rabbit"));
    }
}
