import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
    public BorderLayoutEx(){
        setTitle("BorderLayout 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(new BorderLayout(50,50));// 가로 세로

        c.add(new JButton("동", null),BorderLayout.EAST);
        c.add(new JButton("서", null),BorderLayout.WEST);
        c.add(new JButton("남", null),BorderLayout.SOUTH);
        c.add(new JButton("북", null),BorderLayout.NORTH);
        c.add(new JButton("중심", null),BorderLayout.CENTER);
        

        setSize(300,300);
        setVisible(true);
    }   
    public static void main(String[] args) {
        new BorderLayoutEx();
    } 
}
