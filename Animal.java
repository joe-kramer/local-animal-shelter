class Animal {
  public String mSpecies;
  public String mName;
  public int mAge;
  public boolean mAdopted;

  public Animal(String species, String name, int age, boolean adopted) {
    mSpecies = species;
    mName = name;
    mAge = age;
    mAdopted = adopted;
  }

  public boolean ageRequirement(int maxAge) {
    return (mAge < maxAge);
  }

  public void isAdopted() {
    mAdopted = true;
  }
}
