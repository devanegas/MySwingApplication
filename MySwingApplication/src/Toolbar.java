import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {


    private JButton btn1;
    private JButton btn2;
    private JTextField textField;
    private StringListener textListener;

    public Toolbar(){
        btn1 = new JButton("Copy");
        btn2 = new JButton("Copy x2");
        textField = new JTextField();


        btn1.addActionListener(this);
        btn2.addActionListener(this);
        textField.addActionListener(this);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        textField.setPreferredSize(new Dimension(270, 20));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        add(textField,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 1;
        add(btn1);
        add(btn1,c);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 1;
        c.gridx = 1;
        c.gridy = 1;
        add(btn2);
        add(btn2,c);
    }


    public void setStringListener(StringListener listener){
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        JButton clicked = (JButton) e.getSource();

        String text = textField.getText();

        if(clicked == btn1){
            if(textListener != null){
                textListener.textEmitted(text+"\n");
            }
        }
        else if(clicked == btn2){
            if(textListener != null){
                textListener.textEmitted(text+"\n");
                textListener.textEmitted(text+"\n");
            }
        }
    }
}
