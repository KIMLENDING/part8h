import java.awt.*;
import javax.swing.*;

public class FlowLayoutEx extends JFrame {
    public FlowLayoutEx(){
        setTitle("FlowLayout 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(new FlowLayout(FlowLayout.LEADING,30,30));
        /**FlowLayout.LEADING 이 FlowLayout.LEFT와 비슷하지만  
         * LEADING은 텍스트의 시작 점이고 
         * LEFT는 왼쪽이라서 범용성에서 문제가 발생 할 수 있기때문에 
         * LEDING과 TRAILING을 사용하는 것을 권장 한다.
         */

        JButton a = new JButton("1", null);
        JButton b = new JButton("2", null);
        JButton x = new JButton("3", null);
        JButton d = new JButton("4", null);
        JButton e = new JButton("5", null);
        JButton f = new JButton("6", null);
        c.add(a);
        c.add(b);
        c.add(x);
        c.add(d);
        c.add(e);
        c.add(f);


        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args) {
        new FlowLayoutEx();
    }
}
