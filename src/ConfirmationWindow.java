import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmationWindow extends JFrame{

    private JButton okay;
    private TokenProcessor p;


    ConfirmationWindow(){
        super("Success!");
        this.setSize(400, 200);
        this.setLocation(600, 600);
        this.setLayout(new FlowLayout());



        //message
        this.add(new JLabel("Successfully added all changes to remote repository."));

        //set up exit button
        okay = new JButton("Back");
        okay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        this.add(okay);

        this.setVisible(true);

    }

}