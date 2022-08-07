public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Hufflepuff(String name, int magicPower, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magicPower, transgression);
        this.honesty = honesty;
        this.loyalty = loyalty;
        this.industriousness = industriousness;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}