
    public class Start {
        public Start() {
        }

        public static void main(String[] args) {
            Animal animal = new Animal("Rocky");
            Lion lion = new Lion("Leo");
            Cow cow = new Cow("Lola");
            animal.animalSound();
            lion.animalSound();
            cow.animalSound();
        }
    }

