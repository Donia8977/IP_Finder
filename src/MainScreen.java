import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainScreen {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("IP Finder Program");
        jFrame.setBounds(30 , 20 , 120 , 50 );
        jFrame.setVisible(true);

        JLabel label = new JLabel("Enter your URL");
        label.setBounds(50,70 , 150 , 60);

        JTextField textField = new JTextField();
        textField.setBounds(30,40 ,200 , 20);

        JButton button = new JButton("Find IP");
        button.setBounds(20,10 , 160 , 30);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = textField.getText();
                try{
                    InetAddress ai = InetAddress.getByName(url);
                    String ip = ai.getHostAddress();
                    JOptionPane.showMessageDialog(jFrame,ip);

                } catch (UnknownHostException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
        jFrame.add(textField);
        jFrame.add(label);
        jFrame.add(button);
        jFrame.setLayout(new GridLayout());


    }
}


