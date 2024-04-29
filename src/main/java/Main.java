
public class Main {
    public static void main(String[] args) {

        OwnerR owner1 = new OwnerR("Gary", 35, "Frankfurt");
        SpeciesR species1 = new SpeciesR("LandtieroderSO", 2000);

        AnimalR lion = new AnimalR(1, "Leo", species1, 5, owner1);
        AnimalR elephant = new AnimalR(2, "Dumbo", species1, 10, owner1);
        AnimalR giraffe = new AnimalR(3, "Gerry", species1, 7, owner1);

        System.out.println("Animal 1: " + lion);
        System.out.println("Animal 2: " + elephant);
        System.out.println("Animal 3: " + giraffe);

        AnimalR lion1 = new AnimalR(1, "Leo", species1, 5, owner1);
        AnimalR lion2 = new AnimalR(1, "Leo", species1, 5, owner1);
        AnimalR elephant2 = new AnimalR(2, "Dumbo", species1, 10, owner1);

        System.out.println("lion1 equals lion2: " + lion1.equals(lion2));
        System.out.println("lion1 equals elephant: " + lion1.equals(elephant2));
        System.out.println(lion1);
        System.out.println("lion1: " + lion1.toString());
        System.out.println(elephant.toString());

    }
}
