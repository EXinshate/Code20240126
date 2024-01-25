import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class WindowEventTest extends JFrame {
    public WindowEventTest(String title) {
        this.setTitle(title);
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("windowOpened --- 窗体关闭了");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("WindowClosing --- 窗体正在关闭");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("WindowClosed --- 窗体关闭了");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("windowIconified --- 窗体最小化了");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("windowDeiconified --- 窗体恢复了");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("WindowActivated --- 窗体变成活动状态");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("windowDeactivated --- 窗体变成不活动状态");
            }
        });
        this.setSize(400, 250);
        this.setLocation(300, 300);
        this.setVisible(true);
    }
}
public class test1 {
    public static void main(String[] args) {
        WindowEventTest tf = new WindowEventTest("窗体事件的处理");
    }
}