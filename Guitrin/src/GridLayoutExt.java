import java.awt.*;
import javax.swing.*;
public class GridLayoutExt extends JFrame {
    public GridLayoutExt (){
        setTitle("GridLayout  연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setBackground(Color.GREEN);
        c.setLayout(new GridLayout(4,3, 5, 5));
        
        for(int i = 1; i<10; i++){
            String num = Integer.toString(i);
            c.add(new JButton(num, null));
        }
        c.add(new JButton("*", null));
        c.add(new JButton("0", null));
        c.add(new JButton("#", null));

        setSize(400,400);
        setVisible(true);

    }
    public static void main(String[] args) {
        new GridLayoutExt();
    }
    
}
