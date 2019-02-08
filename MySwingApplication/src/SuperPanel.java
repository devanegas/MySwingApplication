import javax.swing.*;
import java.awt.*;

public class SuperPanel extends JPanel {
    private Toolbar toolbar;
    private JTextArea textArea;


    public SuperPanel(){

        toolbar = new Toolbar();

        setLayout(new BorderLayout());
        add(toolbar, BorderLayout.NORTH);


        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        toolbar.setStringListener(new StringListener() {
            public void textEmitted(String text) {
                textArea.append(text);
            }
        });


    }



}
