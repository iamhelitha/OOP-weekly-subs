package Models;

public class Bicycle {
    private int Gear;
    private double Speed;
    public void setSpeed(double Speed)//setter
    {
        this.Speed=Speed;
    }
    public void setGear(int Gear)//setter
    {
        this.Gear=Gear;
    }
    public int getGear() //Getter
    {
        return this.Gear;
    }
    public double getSpeed() //Getter
    {
        return this.Speed;
    }
    public Bicycle(int Gear,double Speed)
    {
        this.Gear=Gear;
        this.Speed=Speed;
    }
    public double applyBrakes(double decrement)
    {
        Speed-=decrement;
        return Speed;
    }
    public double speedUp(double increment)
    {
        Speed+=increment;
        return Speed;
    }
    @Override
    public String toString() {
        return "Current Speed "+this.Speed+" Gear "+this.Gear;
    }
}
