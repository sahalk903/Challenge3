import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import git.tools.client.GitSubprocessClient;

public class GitSubprocessor extends JPanel {
     private JTextField commitMessage, repoPath, branch;
     private JLabel reportToUser, commitTitle, repoTitle, branchTitle;
     private JButton button;
     private TokenProcessor g;
     private JPanel commitPanel, branchPanel, repoPanel;

     public GitSubprocessor() {
         g = new TokenProcessor();


        repoPanel = new JPanel();
        repoPanel.setLayout(new BorderLayout());
        repoTitle = new JLabel("Local Repo Path");
        repoPanel.add(repoTitle, BorderLayout.NORTH);
        repoPath = new JTextField();
        repoPath.setColumns(30);
        repoPanel.add(repoPath, BorderLayout.CENTER);
        repoPanel.setVisible(true);
        this.add(repoPanel);

        branchPanel = new JPanel();
        branchPanel.setLayout(new BorderLayout());
        branchTitle = new JLabel("Branch");
        branchPanel.add(branchTitle, BorderLayout.NORTH);
        branch = new JTextField();
        branch.setColumns(30);
        branchPanel.add(branch, BorderLayout.CENTER);
        branchPanel.setVisible(true);
        this.add(branchPanel);

         commitPanel = new JPanel();
         commitPanel.setLayout(new BorderLayout());
         commitTitle = new JLabel("Commit Message");
         commitPanel.add(commitTitle, BorderLayout.NORTH);
         commitMessage = new JTextField();
         commitMessage.setColumns(30);
         commitPanel.add(commitMessage, BorderLayout.CENTER);
         commitPanel.setVisible(true);
         this.add(commitPanel);

        // Button to call add, commit, push

        button = new JButton("Push");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GitSubprocessClient gitSubprocessClient = new GitSubprocessClient(repoPath.getText());
                gitSubprocessClient.gitAddAll();
                gitSubprocessClient.gitCommit(commitMessage.getText());
                gitSubprocessClient.gitPush(branch.getText());
                commitMessage.setText("");
                new ConfirmationWindow();
            }
        });

         commitPanel.add(button, BorderLayout.SOUTH);

        // this.add(commitPanel);
        // commitPanel.setVisible(true);
         this.setVisible(true);

    }

    public void setDarkMode(){
         this.setBackground(Color.gray);
         commitPanel.setBackground(Color.gray);
         commitMessage.setForeground(Color.blue);
         commitTitle.setForeground(Color.white);
         commitMessage.setBackground(Color.lightGray);

        repoPanel.setBackground(Color.gray);
        repoTitle.setForeground(Color.white);
        repoPath.setForeground(Color.blue);
        repoPath.setBackground(Color.lightGray);

        branchPanel.setBackground(Color.gray);
        branchTitle.setForeground(Color.white);
        branch.setForeground(Color.blue);
        branch.setBackground(Color.lightGray);

    }
}


