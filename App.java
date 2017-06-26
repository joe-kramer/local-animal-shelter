import java.io.Console;

public class App {
  public static void main(String[] args) {
    Animal dog = new Animal();
    dog.mSpecies = "dog";
    dog.mName = "Scottie";
    dog.mAge = 5;

    Animal cat = new Animal();
    cat.mSpecies = "cat";
    cat.mName = "Franky";
    cat.mAge = 3;

    Animal bird = new Animal();
    bird.mSpecies = "bird";
    bird.mName = "Ally";
    bird.mAge = 2;

    Animal[] animals = {dog, cat, bird};

    System.out.println("All Animals At Shelter:");

    for (Animal animal : animals) {
      System.out.println( "----------------------" );
      System.out.println( animal.mSpecies );
      System.out.println( animal.mName );
      System.out.println( animal.mAge );
    }
  }
}
