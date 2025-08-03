package BCAThirdSemester;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.*;

        public class MouseCalculator extends JFrame implements MouseListener {

            JTextField num1, num2, result;
            JButton calculate;

            public MouseCalculator() {
                setTitle("Calculator");
                setSize(300, 200);
                setDefaultCloseOperation(EXIT_ON_CLOSE);
                setLayout(new GridLayout(4, 2));

                // Labels and text fields
                add(new JLabel("Number One:"));
                num1 = new JTextField();
                add(num1);

                add(new JLabel("Number Two:"));
                num2 = new JTextField();
                add(num2);

                add(new JLabel("Result:"));
                result = new JTextField();
                result.setEditable(false);
                add(result);

                // Button
                calculate = new JButton("Calculate");
                calculate.addMouseListener(this); // Add MouseListener to the button
                add(calculate);

                setVisible(true);
            }

            // Helper method to parse input
            int getInput(JTextField field) {
                try {
                    return Integer.parseInt(field.getText());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Please enter valid numbers.");
                    return 0;
                }
            }

            // MouseListener methods

            public void mousePressed(MouseEvent e) {
                int number1 = getInput(num1);
                int number2 = getInput(num2);
                int sum = number1 + number2;
                result.setText(String.valueOf(sum));
            }

            public void mouseReleased(MouseEvent e) {
                int number1 = getInput(num1);
                int number2 = getInput(num2);
                int difference = number1 - number2;
                result.setText(String.valueOf(difference));
            }

            // Unused but required MouseListener methods

            public void mouseClicked(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}

            // Main method
            public static void main(String[] args) {
                SwingUtilities.invokeLater(() -> new MouseCalculator());
            }
        }