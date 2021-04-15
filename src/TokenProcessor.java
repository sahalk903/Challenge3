import github.tools.client.GitHubApiClient;
import github.tools.responseObjects.*;

public class TokenProcessor {
    private String token;
    private String username;
    public GitHubApiClient client;

    TokenProcessor(){
        username = null;
        token = null;

        client  = new GitHubApiClient(username, token);
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setUsername(String username){
        this.username = username;

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
