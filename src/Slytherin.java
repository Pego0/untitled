public class Slytherin extends Hogwarts{
    private int tricky;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magicPower, int transgression, int tricky, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magicPower, transgression);
        this.ambition = ambition;
        this.determination = determination;
        this.tricky = tricky;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTricky() {
        return tricky;
    }

    public void setTricky(int tricky) {
        this.tricky = tricky;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
}