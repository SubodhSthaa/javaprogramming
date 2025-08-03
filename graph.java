package BCAThirdSemester;
import javax.swing.*;
public class graph {
    JFrame f1;
    JLabel L1,L2,L3;
    JTextField T1,T2;
    JPasswordField P1;
    JButton B1;

    graph(){
        f1 = new JFrame("Form");
        f1.setBounds(100, 100, 400, 300);
        f1.setLayout(null); // Using null layout for manual positioning

        L1 = new JLabel("Id:");
        L1.setBounds(50, 50, 100, 30);
        f1.add(L1);

        T1 = new JTextField();
        T1.setBounds(150, 50, 200, 30);
        f1.add(T1);

        L2 = new JLabel("Name:");
        L2.setBounds(50, 100, 100, 30);
        f1.add(L2);

        T2 = new JTextField();
        T2.setBounds(150, 100, 200, 30);
        f1.add(T2);

        L3 = new JLabel("Password:");
        L3.setBounds(50, 150, 100, 30);
        f1.add(L3);

        P1 = new JPasswordField();
        P1.setBounds(150, 150, 200, 30);
        f1.add(P1);

        B1 = new JButton("Submit");
        B1.setBounds(150, 200, 100, 30);
        f1.add(B1);

        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setVisible(true);
    }


    public static void main(String[] args) {
        new graph();
    }
}