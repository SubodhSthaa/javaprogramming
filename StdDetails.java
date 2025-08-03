package BCAThirdSemester;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StdDetails {
    JFrame F1;
    JLabel lblid, lbluser, lblemail, lblgender, lblfaculty;
    JTextField txtid, txtusername, txtemail, txt3, txt4;
    JButton btndisplay, btnreset, btnsubmit;
    JComboBox combobox;
    JRadioButton btnmale, btnfemale;
    ButtonGroup group;

    public StdDetails() {
        F1 = new JFrame("Register");

        // For ID
        lblid = new JLabel("Id:");
        lblid.setBounds(50, 50, 100, 30);
        txtid = new JTextField();
        txtid.setBounds(150, 50, 200, 30);

        // For Username
        lbluser = new JLabel("Username:");
        lbluser.setBounds(50, 100, 100, 30);
        txtusername = new JTextField();
        txtusername.setBounds(150, 100, 200, 30);

        // For Email
        lblemail = new JLabel("Email:");
        lblemail.setBounds(50, 150, 100, 30);
        txtemail = new JTextField();
        txtemail.setBounds(150, 150, 200, 30);

        // For Gender
        lblgender = new JLabel("Gender");
        lblgender.setBounds(50, 200, 100, 30);

        btnmale = new JRadioButton("a. Male");
        btnmale.setBounds(150, 200, 100, 30);

        btnfemale = new JRadioButton("b. Female");
        btnfemale.setBounds(250, 200, 100, 30);

        // For Faculty
        String[] Faculties = {"Select Faculty", "BCA", "BBA", "BBS", "BIT"};
        combobox = new JComboBox(Faculties);
        combobox.setBounds(150, 250, 200, 30);

        // For Button Group
        group = new ButtonGroup();
        group.add(btnmale);
        group.add(btnfemale);

        F1.add(lblid);
        F1.add(txtid);
        F1.add(lbluser);
        F1.add(txtusername);
        F1.add(lblemail);
        F1.add(txtemail);
        F1.add(lblgender);
        F1.add(btnmale);
        F1.add(btnfemale);
        F1.add(combobox);

        // For Buttons
        btnsubmit = new JButton("Display");
        btnsubmit.setBounds(150, 300, 100, 30);
        F1.add(btnsubmit);

        btnreset = new JButton("Reset");
        btnreset.setBounds(250, 300, 100, 30);
        F1.add(btnreset);
        F1.setSize(400, 400);


        F1.setLayout(null);
        F1.setVisible(true);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Event Handling for Display Button
        btnsubmit.addActionListener(e -> {
            try {
                int id = Integer.parseInt(txtid.getText());
                String username = txtusername.getText();
                String email = txtemail.getText();
                String gender = btnmale.isSelected() ? "Male" : "Female";
                String faculty = combobox.getSelectedItem().toString();

                System.out.println("Id = " + id);
                System.out.println("Username = " + username);
                System.out.println("Email = " + email);
                System.out.println("Gender = " + gender);
                System.out.println("Faculty = " + faculty);

                JOptionPane.showMessageDialog(F1, "ID: " + id + "\nUsername: " + username + "\nEmail: " + email + "\nGender: " + gender + "\nFaculty: " + faculty);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(F1, "Please enter a valid numeric ID", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        });
        // Event Handling for Reset Button
        btnreset.addActionListener(e -> {
            txtid.setText("");
            txtusername.setText("");
            txtemail.setText("");
            group.clearSelection();
            combobox.setSelectedIndex(0);
        });
    }

    public static void main(String[] args) {
        new StdDetails();
    }
}