package factory.client;

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
    }
}
