public class Ravenclaw extends Hogwarts{
    private int cleverness;
    private int wit;
    private int wisdom;
    private int fullOfCreative;
    public Ravenclaw(String name, int magicPower, int transgression, int cleverness, int wisdom, int wit, int fullOfCreative) {
        super(name, magicPower, transgression);
        this.cleverness = cleverness;
        this.wit = wit;
        this.wisdom = wisdom;
        this.fullOfCreative = fullOfCreative;
    }
    public int getCleverness() {
        return cleverness;
    }
    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getFullOfCreative() {
        return fullOfCreative;
    }
    public void setFullOfCreative(int fullOfCreative) {
        this.fullOfCreative = fullOfCreative;
    }
}