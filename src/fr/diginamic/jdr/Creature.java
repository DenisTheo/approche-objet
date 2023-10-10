package fr.diginamic.jdr;

import java.util.Random;

public abstract class Creature
{
    private int str;
    private int hp;
    private Random rand = new Random();

    protected Creature(int strMin, int strMax, int hpMin, int hpMax)
    {
        setStr(rand.nextInt(strMin, strMax+1));
        setHP(rand.nextInt(hpMin, hpMax+1));
    }

    public int Attack()
    {
        return str + rand.nextInt(1, 10);
    }

    public void getDamage(int damage)
    {
    	hp -= damage;
    }

    public int getHP()
    {
        return hp;
    }

    protected void setHP(int hp)
    {
        this.hp = hp;
    }

    protected void setStr(int str)
    {
        this.str = str;
    }

    protected int getStr()
    {
        return str;
    }
	
	public abstract int getScore();
}