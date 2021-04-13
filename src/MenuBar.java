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

        JMenuItem lightMode = new JMenuItem("Light Mode");
        addToken.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //switch to light mode here

                // ;
            }
        });

        JMenuItem darkMode = new JMenuItem("Dark Mode");
        addToken.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                //switch to dark mode here
                // toggleDarkMode();
            }
        });


        JMenu configure = new JMenu("Configure");
        this.add(configure);
        configure.add(addToken);


        JMenu view = new JMenu("View");
        this.add(view);
        view.add(darkMode);
        view.add(lightMode);




        setVisible(true);
    }

}
