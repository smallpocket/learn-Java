package innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * This program demonstrates the use of inner classes.
 * 内部类的使用
 *
 * @Author : Hyper
 * @Time : 2018/10/19 19:40
 */
public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        // keep program running until user selects "Ok"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * Constructs a talking clock
     *
     * @param interval the interval between messages (in milliseconds)
     * @param beep     true if the clock should beep
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * 类的方法构造内部类的实例
     */
    public void start() {
        //构造内部类
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();
    }

    /**
     * 内部类
     * 内部类可以访问外部类的变量
     */
    public class TimePrinter implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + new Date());
            //这个beep是外部类的变量
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
