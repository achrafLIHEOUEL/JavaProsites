
public class Animal {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        if (age < 0) {
            System.out.println("Error: Age cannot be negative. Setting age to 0.");
            this.age = 0;
        } else {
            this.age = age;
        }

        this.isMammal = isMammal;
    }
    public String getFamily() {
        return family;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public void displayAnimal() {
        System.out.println("Family : " + getFamily());
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Is Mammal : " + isMammal());
    }

    @Override
    public String toString() {
        return "Animal Name: " + getName() + ", Family: " + getFamily() + ", Age: " + getAge() + ", Is Mammal: " + isMammal();
    }


}


