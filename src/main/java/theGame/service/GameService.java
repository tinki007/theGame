package theGame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import theGame.model.Player;
import theGame.repository.PlayerRepository;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Piotrek on 22.11.2016.
 */
@Service
public class GameService {

    @Autowired
    private PlayerService playerService;
    private List<Player> players;
    private Iterator<Player> playerIterator;

    public void startTheGame() {
        players = playerService.getPlayers();
        playerIterator = players.iterator();
        if (playerIterator.hasNext()) {
            playerService.setActivePlayer(playerIterator.next());
        } else {
            // throw new NoPlayersException();
        }
    }

    public void finishTurn() {
        if (playerIterator.hasNext()) {
            playerService.setActivePlayer(playerIterator.next());
        } else {
            finishRound();
        }
    }

    public void movePlayer(int newX, int newY) {
        //boolean playerService.movePlayer() throws outOfActionPointsException
    }

    public void attackMonster() {

    }

    public void addScore() {

    }

    public void boostPlayerStats() {

    }

    private void finishRound() {

    }
}
