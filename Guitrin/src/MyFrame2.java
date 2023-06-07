import java.awt.*;
import javax.swing.*;

public class MyFrame2 extends JFrame{
    public MyFrame2(){
        /**순서도
         * 1 타이틀 setTitle
         * 2 프레임 크기 setSize
         * 3 프레임 출력 setVisible
         */
        setTitle("300x300 스윙 프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();// 컴포넌트를 달기위해 컨텐트팬을 가져온다.
        c.setBackground(Color.GRAY);
        c.setLayout(new FlowLayout());

        JButton b = new JButton("click");
        b.setBackground(Color.BLUE);
        c.add(b);
        c.add(new JLabel("안녕하세요"));
        
        JButton ad = new JButton("star", null);
        ad.setLayout(new BorderLayout());
        //c.add(ad);
        setSize(300, 300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MyFrame2(); //이벤트 처리 스레드가 살아 있어 종료되지 않음 
        //즉 메인은 종료 되지만 응용프로그램은 종료되지 않는다.
    }
}
