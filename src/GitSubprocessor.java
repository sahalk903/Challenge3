import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import git.tools.client.GitSubprocessClient;

public class GitSubprocessClient {
    GitSubprocessClient gitSubprocessClient = new GitSubprocessClient(repoPath);


 public class Button extends JFrame {
     protected JTextField commitMessage;
     private JButton button;


     // JTextField commit message

        this.add(new JLabel("Commit Message"));
        commitMessage = new JTextField();
        commitMessage.setColumns(30);
        this.add(commitMessage);

        // Button to call add, commit, push

     button = new JButton("button");
        enter.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed (ActionEvent e){
             gitSubprocessClient.gitPush("master");
             gitSubprocessClient.gitAddAll();

         }
     }

         this.add(enter);
         this.setVisible(true);

 }
}


