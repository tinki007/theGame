package theGame.model;

import java.awt.Point;

public class Player {
	private int attack;
	private int movementSpeed;
	private int health;
	private Point position;
	
	public Player() {
	}
	

	public Player(int attack, int movementSpeed, int health, Point position) {
		super();
		this.attack = attack;
		this.movementSpeed = movementSpeed;
		this.health = health;
		this.position = position;
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
	
	
}
