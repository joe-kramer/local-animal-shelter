import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    boolean programRunning = true;

    Animal dog = new Animal("dog", "Scottie", 5, false, true);
    Animal cat = new Animal("cat", "Franky", 3, false, true);
    Animal bird = new Animal("bird", "Ally", 2, false, false);

    List<Animal> animals = new ArrayList<Animal>();
    animals.add(dog);
    animals.add(cat);
    animals.add(bird);

    while(programRunning) {
      System.out.println("Welcome to our local animal shelter. What would you like to do? Enter one of the following options: \"See All Animals\", \"See Indoor Animals\", \"Add New Animal\", or \"Exit\"");
      String userResponse = myConsole.readLine();

      if(userResponse.equals("See All Animals")) {
        System.out.println("Here is a list of the animals we have:");

        for (Animal animal : animals) {
          System.out.println( "----------------------" );
          System.out.println( animal.mSpecies );
          System.out.println( animal.mName );
          System.out.println( animal.mAge );
        }
      } else if (userResponse.equals("See Indoor Animals")) {
        for (Animal animal : animals) {
          if(animal.insidePet()) {
            System.out.println( "----------------------" );
            System.out.println( animal.mSpecies );
            System.out.println( animal.mName );
            System.out.println( animal.mAge );
          }
        }
      } else if (userResponse.equals("Add New Animal")) {
        System.out.println("Alright, let's add an animal! What species is this animal?");
        String userSpecies = myConsole.readLine();
        System.out.println("What is your animal's name");
        String userName = myConsole.readLine();
        System.out.println("What is your animal's age");
        int userAge = Integer.parseInt(myConsole.readLine());
        Animal userAnimal = new Animal(userSpecies, userName, userAge, true, true);
        animals.add(userAnimal);
        System.out.println("Alright, here's your added animal:");
        System.out.println( "----------------------" );
        System.out.println( userAnimal.mSpecies );
        System.out.println( userAnimal.mName );
        System.out.println( userAnimal.mAge );
      } else if (userResponse.equals("Exit")) {
        programRunning = false;
      }
    }
  }
}
