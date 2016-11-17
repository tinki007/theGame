package theGame.controller;

import org.springframework.expression.spel.ast.LongLiteral;
import org.springframework.web.bind.annotation.*;
import theGame.model.Player;

import java.util.List;

/**
 * Created by Piotrek on 17.11.2016.
 */
@RestController
//@RequestMapping("player/")
public class PlayerController {

    @RequestMapping(value = "players", method = RequestMethod.GET)
    public List<Player> listOfPlayers() {
        return PlayerStub.list();
    }

    @RequestMapping(value = "players", method = RequestMethod.POST)
    public Player create (@RequestBody Player player) {
        return PlayerStub.create(player);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.GET)
    public Player get(@PathVariable Long id) {
        return PlayerStub.get(id);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.PUT)
    public Player update(@PathVariable Long id, @RequestBody Player player) {
        return PlayerStub.update(id, player);
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
    public Player delete(@PathVariable Long id) {
        return PlayerStub.delete(id);
    }
}
