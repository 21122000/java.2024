public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    // Constructeur paramétré
    public Animal( String name, int age, boolean isMammal) {

        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // Méthode pour afficher les informations de l'animal
    public void displayAnimal() {
        System.out.println("Nom: " + name +  ", Âge: " + age + ", Mammifère: " + isMammal);
    }
    @Override
    public String toString() {
        return "Nom: " + name + ", Âge: " + age + ", Mammifère: " + isMammal;
    }
}
