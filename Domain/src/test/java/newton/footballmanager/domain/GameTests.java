package newton.footballmanager.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTests {

    @Test
    void startGame() {
        var footballGame = Game.Create();
        var manCity = Team.Create("ManCity");
        var liverPool = Team.Create("LiverPool");
        var count = footballGame.Match(manCity, liverPool);
        assertEquals(2, count);
    }
}
