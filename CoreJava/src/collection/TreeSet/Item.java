package collection.TreeSet;

import java.util.Objects;

/**
 * 实现了比较的接口Comparable
 *
 * @Author : Heper
 * @Time : 2019/2/3 19:26
 */
public class Item implements Comparable<Item> {
    private String description;
    private int partNumber;

    /**
     * Constructs an item.
     *
     * @param aDescription the item's description
     * @param aPartNumber  the item's part number
     */
    public Item(String aDescription, int aPartNumber) {
        description = aDescription;
        partNumber = aPartNumber;
    }

    /**
     * Gets the description of this item.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[description=" + description + ", partNumber=" + partNumber + "]";
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Item other = (Item) otherObject;
        return Objects.equals(description, other.description) && partNumber == other.partNumber;
    }

    /**
     * 重写了hashcode方法
     *
     * @return 返回一个散列码
     */
    @Override
    public int hashCode() {
        return Objects.hash(description, partNumber);
    }

    /**
     * 重新定义比较排序的规则
     *
     * @param other
     * @return
     */
    @Override
    public int compareTo(Item other) {
        int diff = Integer.compare(partNumber, other.partNumber);
        return diff != 0 ? diff : description.compareTo(other.description);
    }
}