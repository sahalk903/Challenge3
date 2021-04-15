import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import git.tools.client.GitSubprocessClient;

public class GitSub extends JFrame {
     protected JTextField commitMessage;
     private JButton button;
     private TokenProcessor g;

     GitSub() {
         g = new TokenProcessor();

         // JTextField commit message

        this.add(new JLabel("Commit Message"));
        commitMessage = new JTextField();
        commitMessage.setColumns(30);
        this.add(commitMessage);

         this.add(new JLabel("Repo Name"));
         commitMessage = new JTextField();
         commitMessage.setColumns(30);
         this.add(repoPath);

        // Button to call add, commit, push

        button = new JButton("button");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GitSubprocessClient gitSubprocessClient = new GitSubprocessClient(repoPath);
                gitSubprocessClient.gitPush("master");
                gitSubprocessClient.getText();


            }
        }

         this.add(button);
         this.setVisible(true);

    }
}


