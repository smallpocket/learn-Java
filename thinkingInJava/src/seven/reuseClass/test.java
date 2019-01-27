package seven.reuseClass;

/**
 * @Author : Heper
 * @Time : 2019/1/25 17:34
 */
class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("Water");
        s = "test";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class test {
    public static void main(String args[]) {

    }
}
