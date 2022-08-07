public class Hogwarts {
    private String name;
    private int magicPower;
    private int transgression;

    public Hogwarts(String name, int magicPower, int transgression) {
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        name = name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    public int compare() {
        return magicPower + transgression;
    }
    public void compareBetween(Hogwarts hogwarts) {
        int compare = compare();
        int compare1 = hogwarts.compare();
        if (compare > compare1) {
            System.out.println(getName() + " is better student then " + hogwarts.getName());
        } else {
            System.out.println(hogwarts.getName() + " is better student " + getName());
        }
    }
}