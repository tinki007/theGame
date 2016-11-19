package theGame.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import theGame.model.Player;

/**
 * Created by Piotrek on 19.11.2016.
 */
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
