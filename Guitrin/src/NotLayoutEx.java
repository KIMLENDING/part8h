import java.awt.*;
import javax.swing.*;

public class NotLayoutEx extends JFrame {
    public NotLayoutEx(){
        setTitle("배치 관리자 없는 컨테이너");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(null);
        /**프레임 위에 패널 올리기 */
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEADING,10,10));
        p.setSize(200,200); // 크기 설정
        p.setLocation(250, 100); // 위치 설정
        p.setBackground(Color.BLUE);
        //p.setBounds(x, y, width, heigth); //크기와 위치 동시에 설정
        c.add(p);

        /**라벨을 p패널 위에 올리기 */
        JLabel la = new JLabel("Hello8");
        la.setSize(60,20); // 크기 설정
        la.setLocation(10, 1);
        p.add(la);

        /**색깔 배열 */
        Color [] color = {Color.RED, Color.BLUE, Color.GRAY, Color.GREEN,
             Color.CYAN,Color.PINK,Color.ORANGE,Color.MAGENTA,Color.WHITE,Color.DARK_GRAY} ;


        for(int i = 0 ; i< 10; i++){
            String s = Integer.toString(i);
            JButton b2 = new JButton(s, null);
            b2.setOpaque(true);
            b2.setBackground(color[i]);
            p.add(b2);
        }


        /**프레임 위에 버튼 올릴건데 계단식으로 쌓아 둘거임 */

        for(int i = 0 ; i< 10; i++){
            String s = Integer.toString(i);
            JButton b = new JButton(s, null);
            b.setBounds(10*i*2+10,10*i*2+10,50,30);
            c.add(b);
        }
        
        JPanel p1 = new JPanel(null);
        p1.setSize(200,200); // 크기 설정
        p1.setLocation(250, 100); // 위치 설정
        p1.setBackground(Color.WHITE);
        //p.setBounds(x, y, width, heigth); //크기와 위치 동시에 설정
        c.add(p);


        setSize(1000,800);
        setVisible(true);
    }         
    public static void main(String[] args) {
        new NotLayoutEx();
    }
}
