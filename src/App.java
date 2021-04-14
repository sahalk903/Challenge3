import github.tools.client.GitHubApiClient;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame{

    public static void main(String[] args){
        App app = new App();
    }

    private MenuBar menuBar;
    private GitHubApiClient client;

    App(){
        //set up window
        super("Challenge 3");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 250);
        setLayout(new BorderLayout());

        //add toolbar
        menuBar = new MenuBar(this);
        this.add(menuBar, BorderLayout.NORTH);

        //set visible
        setVisible(true);
    }

    public void toggleDarkMode(){
        //dark mode
    	getContentPane().setBackground(Color.gray);
    	menuBar.setBackground(Color.gray);
    	menuBar.getMenu(0).getMenuComponent(0).setBackground(Color.gray);
    	menuBar.getMenu(1).getMenuComponent(0).setBackground(Color.gray);
    	menuBar.getMenu(1).getMenuComponent(1).setBackground(Color.gray);
    }
    
    public void toggleLightMode(){
        //light mode
    	getContentPane().setBackground(Color.white);
    	menuBar.setBackground(Color.white);
    	menuBar.getMenu(0).getMenuComponent(0).setBackground(Color.white);
    	menuBar.getMenu(1).getMenuComponent(0).setBackground(Color.white);
    	menuBar.getMenu(1).getMenuComponent(1).setBackground(Color.white);
    }


    public void setClient(GitHubApiClient client){
        this.client = client;
    }

}
