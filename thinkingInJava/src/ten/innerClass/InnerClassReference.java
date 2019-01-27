package ten.innerClass;

/**
 * 在外部获得内部类的引用
 *
 * @Author : Heper
 * @Time : 2019/1/26 16:31
 */
public class InnerClassReference {
    /**
     * 创建内部类
     * 这个内部类必须是一个public的
     */
    public class Content {
        private int i;

        Content() {
            i = 1;
        }
    }

    public Content getContent() {
        return new Content();
    }

    public static void main(String args[]) {
        InnerClassReference innerClassReference = new InnerClassReference();
        //与一般的类创建不同,这个类的创建需要添加它的外围类
        InnerClassReference.Content content = innerClassReference.getContent();
        //也可以采用另一种方式,与平时看到的new语法不同的是,需要在前面加一个外围类的对象
        InnerClassReference.Content content2 = innerClassReference.new Content();
    }
}
