class Animal {
  public String mSpecies;
  public String mName;
  public int mAge;
  public boolean mAdopted;
  public boolean mInsidePet;

  public Animal(String species, String name, int age, boolean adopted, boolean insidePet) {
    mSpecies = species;
    mName = name;
    mAge = age;
    mAdopted = adopted;
    mInsidePet = insidePet;
  }

  public boolean ageRequirement(int maxAge) {
    return (mAge < maxAge);
  }

  public void isAdopted() {
    mAdopted = true;
  }

  public boolean insidePet() {
    return mInsidePet;
  }
}
