public class Zoo {

    Animal[] animals;
    String name;
    String city;
    final int nbrCages=25;
    int animalCount;

    public Zoo( String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.animalCount = 0;

    }
    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Number of Animals: " + animalCount);
    }
    public boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] == null) {
                    animals[i] = animal;
                    animalCount++;
                    return true;
                }
            }
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animals in the zoo:");
        for (int i = 0; i < animalCount; i++) {
            if (animals[i] != null) {
                System.out.println(animals[i]); //
            }
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {

            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }

        return -1;
    }
    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


}
