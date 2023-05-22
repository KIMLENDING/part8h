import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JFrame {
    public NorthPanel(){
        setBackground(Color.LIGHT_GRAY);
        
        setTitle("연습문제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container cP = getContentPane();
        JLabel la = new JLabel("Hello, Press Buttons!");
        la.setBounds(150, 100, 200, 300);
        add(la,BorderLayout.CENTER);

        cP.setLayout(new FlowLayout()); // 레이아웃 설정

        cP.add(new JButton("cancel"),BorderLayout.NORTH); // 취소 버튼 생성 후 컨텐트 팬에 추가
        cP.add(new JButton("ignore"),BorderLayout.NORTH); // 무시 버튼 생성 후 컨텐트 팬에 추가
        cP.add(new JButton("add"),BorderLayout.NORTH); // 무시 버튼 생성 후 컨텐트 팬에 추가
        
        
        

        setSize(500,500);
        setVisible(true);
    }
    public static void main(String[] args) {
        NorthPanel npf = new NorthPanel(); // MyFrame 객체 생성
    }
}
