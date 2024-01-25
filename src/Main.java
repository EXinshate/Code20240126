import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame jf = new JFrame("null 布局实例");
        JButton btn1 = new JButton("按钮1");
        JButton btn2 = new JButton("按钮2");
        jf.setLayout(null);
        btn1.setBounds(100, 30, 80, 50);
        btn2.setBounds(100, 100, 80, 50);
        jf.add(btn1);
        jf.add(btn2);
        jf.setSize(300, 250);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}