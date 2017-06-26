import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    Animal dog = new Animal("dog", "Scottie", 5, false);
    Animal cat = new Animal("cat", "Franky", 3, false);
    Animal bird = new Animal("bird", "Ally", 2, false);

    Animal[] animals = {dog, cat, bird};

    System.out.println("What is the max age you would like your pet to be?");
    String stringMaxAge = myConsole.readLine();
    Integer userMaxAge = Integer.parseInt(stringMaxAge);

    System.out.println("Here is a list of the animals we have that meet your age requirement:");

    for (Animal animal : animals) {
      if(animal.ageRequirement(userMaxAge)) {
        System.out.println( "----------------------" );
        System.out.println( animal.mSpecies );
        System.out.println( animal.mName );
        System.out.println( animal.mAge );
      }
    }
  }
}
