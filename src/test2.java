import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class test2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("键盘事件的处理");
        jf.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("keyTyped事件发生：" + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("keyPressed事件发生:" + e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("keyReleased事件发生:" + e.getKeyChar());
            }
        });
        jf.setSize(400, 250);
        jf.setLocation(300, 300);
        jf.setVisible(true);
    }
}
