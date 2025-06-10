package Kasus2_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PenjumlahanForm extends JFrame implements ActionListener {
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public PenjumlahanForm() {
        textField1 = new JTextField();
        textField2 = new JTextField();
        button = new JButton("Jumlah");

  
        button.addActionListener(this);

      
        setLayout(new GridLayout(3, 1));
        add(textField1);
        add(textField2);
        add(button);

  
        setTitle("Penjumlahan");
        setSize(200, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int nilai1 = Integer.parseInt(textField1.getText());
            int nilai2 = Integer.parseInt(textField2.getText());
            int hasil = nilai1 + nilai2;

            JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new PenjumlahanForm();
    }
}

