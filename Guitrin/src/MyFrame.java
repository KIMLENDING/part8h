import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements ActionListener, KeyListener {
    JTextField textField; // 텍스트 필드 선언

    MyFrame() {
        setTitle("첫번째 프래임"); // 프레임 타이틀 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임 종료 설정

        Container contentPane = getContentPane(); // 컨텐트 팬 생성
        contentPane.setBackground(Color.ORANGE); // 배경색 설정
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); // 레이아웃 설정

        textField = new JTextField(20); // 텍스트 필드 생성
        textField.addKeyListener(this); // 텍스트 필드에 이벤트 리스너 등록
        contentPane.add(textField); // 컨텐트 팬에 추가

        JButton okButton = new JButton("OK"); // OK 버튼 생성
        okButton.addActionListener(this); // OK 버튼에 이벤트 리스너 등록
        contentPane.add(okButton); // 컨텐트 팬에 추가

        contentPane.add(new JButton("cancel")); // 취소 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("ignore")); // 무시 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("add")); // 무시 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("sub")); // 무시 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("mul")); // 무시 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("div")); // 무시 버튼 생성 후 컨텐트 팬에 추가
        contentPane.add(new JButton("Calculate")); // 무시 버튼 생성 후 컨텐트 팬에 추가

        setSize(400, 400); // 프레임 크기 설정
        setVisible(true); // 프레임 보이기
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame(); // MyFrame 객체 생성
    }

    @Override
    public void actionPerformed(ActionEvent e) { // 이벤트 처리 메소드
        String inputText = textField.getText(); // 텍스트 필드에서 입력받은 문자열 가져오기
        JFrame newFrame = new JFrame(); // 새로운 프레임 생성
        newFrame.setTitle("입력 결과"); // 새로운 프레임 타이틀 설정
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // 새로운 프레임 종료 설정
        newFrame.setSize(250, 100); // 새로운 프레임 크기 설정
        newFrame.setLocationRelativeTo(null); // 새로운 프레임 위치 설정
        JLabel label = new JLabel(inputText); // 입력받은 문자열을 표시할 레이블 생성
        newFrame.add(label); // 새로운 프레임에 레이블 추가
        newFrame.setVisible(true); // 새로운 프레임 보이기
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) { // 엔터키를 눌렀을 때
            actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null)); // OK 버튼 클릭 이벤트 발생
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}