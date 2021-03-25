package interfacesgraficas;

import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener {

    private JTextField jtf1;
    private JLabel lbl1;
    private JButton bot1;

    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lbl1 = new JLabel("Mensaje: ");
        lbl1.setBounds(15, 10, 100, 30);
        add(lbl1);
        jtf1 = new JTextField();
        jtf1.setBounds(80, 16, 190, 20);
        add(jtf1);
        bot1 = new JButton("Mostrar");
        bot1.setBounds(10, 60, 100, 30);
        add(bot1);
        bot1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == bot1) {
            String mensaje = jtf1.getText();
            JOptionPane.showMessageDialog(null,mensaje);
        }
    }

    public void Igrafica() {
        Formulario form = new Formulario();
        form.setBounds(0,0,300,150);
        form.setLocationRelativeTo(form);
        form.setVisible(true);
    }
}
