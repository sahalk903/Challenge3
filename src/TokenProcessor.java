import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.*;

public class TokenProcessor {
    private String token;
    private String username;
    public GitHubApiClient client;

    TokenProcessor(){
        username = null;
        token = null;
    }

    public void setToken(String token) {
        this.token = token;
        System.out.println("Token entered: " + token);
    }

    public String getToken() {
        return token;
    }

    public void setUsername(String username){
        this.username = username;
        System.out.println("Username entered: " + username);
    }

    public String getUsername(){
        return username;
    }

    public GitHubApiClient getAPIClient(){
        return client;
    }

    public void createClient(){
        client = new GitHubApiClient(username, token);
    }
}
