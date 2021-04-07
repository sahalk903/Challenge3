import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar {

    public MenuBar(){
        super();

        //create menu items
        JMenuItem addToken = new JMenuItem("Add Token");
        addToken.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                new TokenWindow();
            }
        });


        JMenu configure = new JMenu("Configure");
        this.add(configure);
        configure.add(addToken);




        setVisible(true);
    }

}
