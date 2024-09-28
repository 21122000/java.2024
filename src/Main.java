public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal( "Lion", 5, true);


        Zoo myZoo = new Zoo("Zoo de Paris", "Paris", 10);


        myZoo.animals[0] = lion;

        myZoo.displayZoo();

        lion.displayAnimal();

        System.out.println(myZoo);
        System.out.println(lion);
    }

}