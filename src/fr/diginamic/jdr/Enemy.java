package fr.diginamic.jdr;

public abstract class Enemy extends Creature
{
	public Enemy(int strMin, int strMax, int hpMin, int hpMax)
	{
		super(strMin, strMax, hpMin, hpMax);
	}
    
    /***
     * Displays the Creature's Sprite
     */
    public abstract void spriteDisplay();
}
