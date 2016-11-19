package theGame.model;

import javax.persistence.*;

@Entity
@Table(name = "PLAYERS")
public class Player {

    @Id
    @GeneratedValue
    private Long id;
	private String name;
	private int attack;
	private int movementSpeed;
	private int health;
    @Enumerated(EnumType.STRING)
    private PlayerType playerType;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="x", column = @Column(name = "POSITION_X")),
            @AttributeOverride(name="y", column = @Column(name = "POSITION_Y"))
    })
    private Point position;
	private int score;
	
	public Player() {
	}

	public Player(Long id, String name, int attack, int movementSpeed, int health, Point position, PlayerType playerType, int score) {
		super();
		this.id = id;
		this.name = name;
		this.attack = attack;
		this.movementSpeed = movementSpeed;
		this.health = health;
		this.position = position;
		this.playerType = playerType;
		this.score =score;
	}

	public Long getId() {
		return id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getMovementSpeed() {
		return movementSpeed;
	}

	public void setMovementSpeed(int movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public PlayerType getPlayerType() {
		return playerType;
	}

	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}

}
