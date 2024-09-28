public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages;

    // Constructeur paramétré
    public Zoo(String name, String city, int nbrCages) {
        this.animals = new Animal[25]; // Maximum 25 animaux
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    // Méthode pour afficher les informations du zoo
    public void displayZoo() {
        System.out.println("Nom du zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages);
    }
    @Override
    public String toString() {
        return "Nom: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages;
    }
    public boolean addAnimal(Animal animal) {
        if (animals.length < nbrCages) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    return true;
                }
            }
        }
        return false; // Si l'animal n'a pas été ajouté
    }
    public void afficherAnimaux() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.getClass());
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].getClass().equals(animal.getClass())) {
                return i;
            }
        }
        return -1; // Non trouvé
    }
}
