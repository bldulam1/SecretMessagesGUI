import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class secretMessagesGUI {
    private JPanel panelMain;
    private JButton buttonHelloWorld;


    private secretMessagesGUI() {
        buttonHelloWorld.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("secretMessagesGUI");
        frame.setContentPane(new secretMessagesGUI().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
