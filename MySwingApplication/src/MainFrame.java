import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {


    private TextArea textArea;
    private JTextField textField;
    private Toolbar toolbar;
    private SuperPanel panel;

    public MainFrame(){
        super("Hello World");

        panel = new SuperPanel();
        add(panel);

        setSize(300, 500);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
