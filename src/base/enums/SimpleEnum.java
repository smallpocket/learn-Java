package base.enums;

/**
 * @Author : Hyper
 * @Time : 2018/10/8 14:30
 */
public enum SimpleEnum {
    /**
     * 为枚举添加注释
     */
    TEST("1"),
    ORDER("2"),
    ;
    /**
     * 枚举类需要字段和构造器两个属性,否则会出错
     */
    private String code;

    public String getCode() {
        return code;
    }

    SimpleEnum(String code) {
        this.code = code;
    }

    /**
     * 使用switch和枚举类进行结合
     */
    public void degree() {
        SimpleEnum simpleEnum = SimpleEnum.TEST;
        switch (simpleEnum) {
            case TEST:
                System.out.println("test");
                return;
            case ORDER:
                System.out.println("orde");
                return;
            default:
                System.out.println("ss");
        }
    }

    public static void main(String[] args) {
        SimpleEnum simpleEnum = SimpleEnum.TEST;
        //输出TEST
        System.out.println(simpleEnum);
        //输出code值
        System.out.println(simpleEnum.getCode());
        simpleEnum.degree();
    }
}
