package theGame.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.spel.ast.LongLiteral;
import org.springframework.web.bind.annotation.*;
import theGame.model.Player;
import theGame.repository.PlayerRepository;

import java.util.List;

/**
 * Created by Piotrek on 17.11.2016.
 */
@RestController
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepo;

    @RequestMapping(value = "players", method = RequestMethod.GET)
    public List<Player> listOfPlayers() {
        return playerRepo.findAll();
    }

    @RequestMapping(value = "players", method = RequestMethod.POST)
    public Player create (@RequestBody Player player) {
        return playerRepo.saveAndFlush(player);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.GET)
    public Player get(@PathVariable Long id) {
        return playerRepo.findOne(id);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.PUT)
    public Player update(@PathVariable Long id, @RequestBody Player player) {
        Player existingPlayer = playerRepo.findOne(id);
        BeanUtils.copyProperties(player,existingPlayer);
        return playerRepo.saveAndFlush(existingPlayer);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
    public Player delete(@PathVariable Long id) {
        Player existingPlayer = playerRepo.findOne(id);
        playerRepo.delete(existingPlayer);
        return existingPlayer;
    }
}
