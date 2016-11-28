package theGame.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import theGame.model.Player;
import theGame.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

/**
 * Created by Piotrek on 24.11.2016.
 */
@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;
    private Player activePlayer;

    public void setActivePlayer(Player activePlayer) {
        this.activePlayer = activePlayer;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll(new Sort(Sort.Direction.ASC, "name"));
    }
}
