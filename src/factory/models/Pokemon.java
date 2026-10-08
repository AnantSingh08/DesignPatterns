package factory.models;

import lombok.Getter;

public abstract class Pokemon {
    @Getter
    protected int health;
    protected int damage;

    protected Pokemon(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public abstract void attack();
    public abstract void move();
}
