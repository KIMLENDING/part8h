import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JFrame {
    JTextField textField; // 텍스트 필드 선언
    public GridLayoutEx(){
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        // 1x10의 gridLayout 배치관리자
        contentPane.setLayout(new GridLayout(1,10));
        for(int i = 0; i<10; i++){
            String text = Integer.toString(i);
            JButton button = new JButton(text); // 오타 수정
            contentPane.add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        GridLayoutEx gf = new GridLayoutEx(); // MyFrame 객체 생성
    }
}
