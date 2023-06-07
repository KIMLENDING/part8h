import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {
    private JTextField tf = new JTextField(20); // 20글자까지 입력 가능한 JTextField 생성
    private JTextArea ta = new JTextArea(13, 20); // 줄바꿈 가능한 7행 20열 JTextArea 생성

    public TextAreaEx() { // 생성자
        setTitle("텍스트 영역 만들기 예제"); // 제목을 '텍스트 영역 만들기 예제'로 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 버튼을 누르면 프로그램 종료
        Container c = getContentPane(); // 컨텐트 팬을 가져옴
        c.setLayout(new FlowLayout()); // 컨텐트 팬의 레이아웃을 FlowLayout으로 설정
        
        c.add(new JLabel("입력 후 <Enter> 키를 입력하세요.")); // 라벨 추가
        c.add(tf); // 텍스트필드 추가
        c.add(new JScrollPane(ta)); // 스크롤바가 있는 JTextArea를 추가

        tf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) { // tf에 ActionListener 추가
                JTextField t = (JTextField) e.getSource(); // tf에서 e를 가져옴
                String a = t.getText(); // tf에서 입력받은 텍스트를 a에 저장
                if (!a.matches("^\\s*$")) { // a가 비어있지 않다면
                    ta.append(a + "\n"); // a를 JTextArea에 추가하고 줄바꿈
                    t.setText(""); // tf 초기화
                }
            }
        });
        setSize(300, 250); // 크기 설정
        setVisible(true); // 창을 표시
    }
    
    public static void main(String[] args) { // 메인 메서드
        new TextAreaEx(); // TextAreaEx 생성자 호출
    }
}
