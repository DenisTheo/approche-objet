package fr.diginamic.jdr;

public class Player extends Creature
{
	public static final int STR_MIN = 12;
	public static final int STR_MAX = 18;
	public static final int HP_MIN = 20;
	public static final int HP_MAX = 50;
	private int score;
	private int hp_bar;
	
	public Player()
	{
		super(STR_MIN, STR_MAX, HP_MIN, HP_MAX);
		hp_bar = getHP(); // sets the max HP to allow healing
	}
	
	public void heal(int regen)
	{
		setHP(Math.min(getHP()+regen, hp_bar));
	}
	
	public int getHPBar()
	{
		return hp_bar;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void addScore(int score)
	{
		this.score += score;
	}
}
