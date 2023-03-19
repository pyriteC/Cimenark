package model;

public class employee 
{
//base stats
private int speed;
private int freindlyness;
private int forgetfullness;
private int strength;
private int efficiency; 
private int lazyness;
//variable stats 
private int morale;
private double level;
	public employee()
	{
		
	}
	
	public int getSpeed() {
		return (int) (speed + level/5);
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getFreindlyness() {
		return (int) (freindlyness+ level/5);
	}
	public void setFreindlyness(int freindlyness) {
		this.freindlyness = freindlyness;
	}
	public int getForgetfullness() {
		return (int) (forgetfullness + level/5);
	}
	public void setForgetfullness(int forgetfullness) {
		this.forgetfullness = forgetfullness;
	}
	public int getStrength() {
		return (int) (strength + level/5);
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getEfficiency() {
		return (int) (efficiency + level/5);
	}
	public void setEfficiency(int efficiency) {
		this.efficiency = efficiency;
	}
	public int getLazyness() {
		return (int) (lazyness + level/5);
	}
	public void setLazyness(int lazyness) {
		this.lazyness = lazyness;
	}
	public int getMorale() {
		return morale;
	}
	public void setMorale(int morale) {
		this.morale = morale;
	}
	public double getLevel() {
		return level;
	}
	public void setLevel(double level) {
		this.level = level;
	}

}
