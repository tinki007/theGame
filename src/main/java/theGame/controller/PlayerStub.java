package theGame.controller;

import theGame.model.Player;
import theGame.model.PlayerType;
import theGame.model.Point;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @deprecated Class not needed anymore! Records are stored in H2 DB right now
 */
@Deprecated
class PlayerStub {
    private static Map<Long, Player> players = new HashMap<Long, Player>();
    private static Long idIndex = 2L;

    //populate initial list of players
    static {
        Player fastPlayer = new Player(1L, "Dżordż", 2, 5, 10, new Point(0, 0), PlayerType.FastDude, 0, 10);
        players.put(1L, fastPlayer);
        Player strongPlayer = new Player(2L, "Harry", 4, 3, 12, new Point(0,0), PlayerType.HeavyDude, 0, 10);
        players.put(2L, strongPlayer);
    }

    static List<Player> list() {
        return new ArrayList<Player>(players.values());
    }

    static Player create(Player player) {
        idIndex++;
        player.setId(idIndex);
        players.put(idIndex,player);
        return player;
    }

    static Player get(Long id) {
        return players.get(id);
    }

    static Player update(Long id, Player player) {
        players.put(id,player);
        return player;
    }

    static Player delete(Long id) {
        return players.remove(id);
    }
}
