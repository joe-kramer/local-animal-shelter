class Animal {
  public String mSpecies;
  public String mName;
  public int mAge;

  public Animal(String species, String name, int age) {
    mSpecies = species;
    mName = name;
    mAge = age;
  }

  public boolean ageRequirement(int maxAge) {
    return (mAge < maxAge);
  }
}
