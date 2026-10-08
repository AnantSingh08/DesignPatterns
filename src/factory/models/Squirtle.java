package factory.models;

public class Squirtle extends Pokemon {
    public Squirtle()
    {
        super(80, 50);
    }

    @Override
    public void attack() {
        System.out.println("Squirtle throws water causing: "+damage+" damage");
    }

    @Override
    public void move() {
        System.out.println("Squirtle swims quickly towards the enemy");
    }
}
