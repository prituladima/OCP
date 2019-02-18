package module1.review1;

public enum AnimalClassees {
    MAMMAL(true),
    FISH(Boolean.FALSE), BIRD(false), REPTILE(false), AMPHIBIAN(false), INVERTEBRATE(false);

    boolean hasHair;

    AnimalClassees(boolean hasHair) {
        this.hasHair = hasHair;
    }

    public boolean hasHair() {
        return hasHair;
    }

    public void giveWig() {
        hasHair = true;
    }


}
