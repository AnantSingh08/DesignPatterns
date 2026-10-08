package factory.models;

public class Charizard extends Pokemon {
    public Charizard()
    {
        super(150, 90);
    }

    @Override
    public void attack() {
        System.out.println("Charizard throws fire causing: "+damage+" damage");
    }

    @Override
    public void move() {
        System.out.println("Charizard flies quickly towards the enemy");
    }
}
