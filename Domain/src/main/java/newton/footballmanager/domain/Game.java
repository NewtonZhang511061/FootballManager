package newton.footballmanager.domain;

public class Game {
    public Game (){
    }

    public static Game Create (){
        return new Game();
    }

    public int Match(Team home, Team away){
        return 2;
    }
}

