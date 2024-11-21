
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name of the zoo");
        zoo.zooName= scanner.nextLine();
        System.out.println("enter the number of cages");
        zoo.nbrCages = scanner.nextInt();
        System.out.println(zoo.zooName + "comporte" + zoo.nbrCages);

        Animal lion= new Animal ("wild","lion", 10, true);
        Animal wolf= new Animal ("wild","wolf", 7, true);
        Animal camel= new Animal ("pet","camel", 12, true);


        Zoo z1=new Zoo("tunis zoo","tunis", 25 );

        z1.displayZoo();
        System.out.println(z1);




        System.out.println(lion);
        System.out.println(wolf);
        System.out.println(camel);

        z1.addAnimal(lion);
        z1.addAnimal(wolf);
        z1.addAnimal(camel);


        if (z1.addAnimal(lion)) {
            System.out.println("Lion added to the zoo.");
        } else {
            System.out.println("Failed to add Lion.");
        }

        if (z1.addAnimal(wolf)) {
            System.out.println("Wolf added to the zoo.");
        } else {
            System.out.println("Failed to add Wolf.");
        }
        if (z1.addAnimal(camel)) {
            System.out.println("Camel added to the zoo.");
        } else {
            System.out.println("Failed to add Camel.");
        }

        z1.displayZoo();
        System.out.println(z1);

        z1.displayAnimals();

        int index = z1.searchAnimal(lion);
        System.out.println("Index of Lion: " + index);
    }
}
