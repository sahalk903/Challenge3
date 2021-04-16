# Project Setup

You will need to install two different packages to add to the project before running it. Follow the links below, go to the releases section on the right hand side of your screen, and download the respective .jar files: GitSubprocessClient-v0.0.12.jar and GitHubApiClient-v0.0.7.jar

GitSubprocessClient - https://github.com/CSC109/GitSubprocessClient
GitHubApiClient - https://github.com/CSC109/GitHubApiClient

Java 8 or higher is required to run the project code.

# Instructions

1. Under configure, select add token.
2. Enter your Github username and access token and then press enter (Don't close this window or you will lose your client). In order to use the GitHubApiClient tool you must create an access token. If you do not know how to create an access token follow this link - https://csc109.github.io/GitHubApiClient/
3. On the main GUI, enter the class path for the local repo, the branch you want to merge into, and the commit message.
4. Press the push button.

All changes will be added, committed, and pushed to the remote repo automatically. A confirmation window will pop up and the user can return to the main GUI.

Note: For convenience, after this process the branch and path stay in the GUI, but the commit message is reset.
