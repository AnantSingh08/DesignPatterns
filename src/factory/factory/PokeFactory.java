package factory.factory;

import factory.models.Charizard;
import factory.models.Pikachu;
import factory.models.Pokemon;
import factory.models.Squirtle;

public class PokeFactory {
    public static Pokemon createPokemon(String type) {
        Pokemon pokemon;

        if(type.equalsIgnoreCase("Pikachu")) {
            pokemon = new Pikachu();
        } else if(type.equalsIgnoreCase("Charizard")) {
            pokemon = new Charizard();
        } else if(type.equalsIgnoreCase("Squirtle")) {
            pokemon = new Squirtle();
        } else {
            throw new IllegalArgumentException("Unknown Pokemon Type: "+ type);
        }
        return pokemon;
    }
}
