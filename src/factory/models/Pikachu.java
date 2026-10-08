package factory.models;

public class Pikachu extends Pokemon {
    public Pikachu()
    {
        super(100, 100);
    }

    @Override
    public void attack() {
        System.out.println("Pikachu throws lightning causing: "+damage+" damage");
    }

    @Override
    public void move() {
        System.out.println("Pikachu charges quickly towards the enemy");
    }
}
