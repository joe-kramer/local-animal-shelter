class Animal {
  public String mSpecies;
  public String mName;
  public int mAge;

  public boolean ageRequirement(int maxAge) {
    return (mAge < maxAge);
  }
}
