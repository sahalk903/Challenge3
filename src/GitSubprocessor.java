
public class GitSubprocessClient {
    GitSubprocessClient gitSubprocessClient = new GitSubprocessClient(repoPath);
    String gitInit = gitSubprocessClient.getInit();
    String gitRemoteAdd = gitSubprocessClient.getRemoteAdd("origin", "https://github.com/CSC109/GitSubprocessClient.git");
    String gitAddFile = gitSubprocessClient.gitAddFile("GitSubprocessClient.java");
    String gitAddAll = gitSubprocessClient.gitAddAll();
    String commitMessage = "This is a commit message";
    String commit = gitSubprocessClient.gitCommit(commitMessage);
    String push = gitSubprocessClient.gitPush("master");
    String status = gitSubprocessClient.gitStatus();
    String log = gitSubprocessClient.gitLog(5);
    String log = gitSubprocessClient.gitLogOneLine(5);
    String log = gitSubprocessClient.gitLogAll();
    String log = gitSubprocessClient.gitLogAllOneLine();
    String checkout = gitSubprocessClient.switchBranch("master");
    String createBranch = gitSubprocessClient.createBranch("new-branch");
    String createBranch = gitSubprocessClient.createAndSwitchBranch("new-branch");
    String deleteBranch = gitSubprocessClient.deleteBranch("new-branch");
    String branches = gitSubprocessClient.listBranches();
    String pull = gitSubprocessClient.gitPull("master");
    String fetch = gitSubprocessClient.gitFetch("master");
    String fetch = gitSubprocessClient.gitFetchAll();
    String stash = gitSubprocessClient.gitStash();
    String stashApply = gitSubprocessClient.gitStashApply();
    String clone = gitSubprocessClient.gitClone();
    String commit = gitSubprocessClient.runGitCommand("push origin master");
    }
