package newton.footballmanager.domain;

public class Team {
    private String _teamName;
    
    public Team (String teamName){
        _teamName = teamName;
    }

    public static Team Create (String teamName){
        return new Team(teamName);
    }
}
