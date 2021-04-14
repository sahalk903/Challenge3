import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TokenWindow extends JFrame{

    protected JTextField tokenField, userField;
    private JButton enter;
    private TokenProcessor p;

    TokenWindow(boolean isDark){
        super("Enter Token");
        this.setSize(400, 200);
        this.setLocation(400, 400);
        this.setLayout(new FlowLayout());

        if(isDark == true)
        {
        	getContentPane().setBackground(Color.gray);
        }
        else
        {
        	getContentPane().setBackground(Color.white);
        }
        
        
        p = new TokenProcessor();

        //set up username field
        this.add(new JLabel("Enter GitHub Username"));
        userField = new JTextField();
        userField.setColumns(30);
        this.add(userField);

        //set up token field
        this.add(new JLabel("Enter GitHub API Access Token"));
        tokenField = new JTextField();
        tokenField.setColumns(30);
        this.add(tokenField);

        //set up enter button
        enter = new JButton("Enter");
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                p.setUsername(userField.getText());
                p.setToken(tokenField.getText());
            }
        });
        this.add(enter);

        this.setVisible(true);

    }

}
