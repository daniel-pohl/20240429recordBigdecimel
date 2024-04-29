
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal(1, "Leo", "Lion", 5);
        Animal elephant = new Animal(2, "Dumbo", "Elephant", 10);
        Animal giraffe = new Animal(3, "Gerry", "Giraffe", 7);

        System.out.println("Animal 1: " + lion);
        System.out.println("Animal 2: " + elephant);
        System.out.println("Animal 3: " + giraffe);

        Animal lion1 = new Animal(1, "Leo", "Lion", 5);
        Animal lion2 = new Animal(1, "Leo", "Lion", 5);
        Animal elephant2 = new Animal(2, "Dumbo", "Elephant", 10);

        System.out.println("lion1 equals lion2: " + lion1.equals(lion2));
        System.out.println("lion1 equals elephant: " + lion1.equals(elephant2));

        System.out.println("lion1: " + lion1.toString());


    }
}
