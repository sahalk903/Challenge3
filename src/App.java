import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    public static void main(String[] args){
        App app = new App();
    }

    private MenuBar menuBar;

    App(){
        //set up window
        super("Challenge 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 250);
        setLayout(new BorderLayout());

        //add toolbar
        menuBar = new MenuBar();
        this.add(menuBar, BorderLayout.NORTH);

        //set visible
        setVisible(true);

    }
}
