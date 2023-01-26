public class Cow extends Animal {
    public Cow(String animalName) {
        super(animalName);
    }

    public void animalSound() {
        System.out.println(this.animalName + " fa Muuu!");
    }
}
