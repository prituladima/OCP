package module2;

public class FindMatchingAnimals {
    private static void print(Animal animal, CheckTrait trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    public static void main(String[] args) {
        Animal a1 = new Animal("fish", false, true);

        print(a1,  a -> a.canHop());
        print(a1, new CheckTrait() {
            @Override
            public boolean test(Animal a) {
                return a.canHop();
            }
        });

        print(a1,  a -> {return a.canHop();});
        print(a1,  (a) -> a.canHop());
        print(a1, (Animal a) -> a.canHop());
        print(a1, Animal::canHop);

//        (int y, z) -> {int x=1; return y+10; } // DOES NOT COMPILE
//        (String s, z) -> { return s.length()+z; } // DOES NOT COMPILE
//        (a, Animal b, c) -> a.getName() // DOES NOT COMPILE
//        (a, b) -> { int a = 0; return 5;};// DOES NOT COMPILE
    }
}