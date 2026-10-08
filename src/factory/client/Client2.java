package factory.client;

import factory.factory.PokeFactory;
import factory.models.Charizard;
import factory.models.Pikachu;
import factory.models.Pokemon;
import factory.models.Squirtle;

import java.util.Scanner;

public class Client2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Pokemon Type (Pikachu, Charizard, Squirtle):");

        String type = scanner.nextLine();

        Pokemon pokemon = PokeFactory.createPokemon(type);

        pokemon.move();
        pokemon.attack();
    }
}
