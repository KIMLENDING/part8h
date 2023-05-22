import javax.swing.*;
import java.awt.*;

public class ExTest extends JFrame {
    ExTest(){
        
        setTitle("배치관리자 없이 절대 위치에 배치하는 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container conp = getContentPane();
        conp.setLayout(null);

        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setLocation(100, 50);
        la.setSize(200, 20);
        conp.add(la);

        for(int i = 0; i<10; i++){
            String text = Integer.toString(i);
            JButton b = new JButton(text); // 오타 수정
            b.setLocation(i*15, i*15);
            b.setSize(50,20);
            conp.add(b);
        }

        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        ExTest  et = new ExTest(); // MyFrame 객체 생성
    }
}


