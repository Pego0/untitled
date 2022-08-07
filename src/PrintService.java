public class PrintService {
    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Name: " + gryffindor.getName() +
                    "; Magic power: " + gryffindor.getMagicPower() +
                    "; Transgression: " + gryffindor.getTransgression() +
                    "; Nobility: " + gryffindor.getNobility() +
                    "; Honor: " + gryffindor.getHonor() +
                    "; Bravery: " + gryffindor.getBravery());
        }
        System.out.println();
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Name: " + hufflepuff.getName() +
                    "; Magic power: " + hufflepuff.getMagicPower() +
                    "; Transgression: " + hufflepuff.getTransgression() +
                    "; Industriousness: " + hufflepuff.getIndustriousness() +
                    "; Loyalty: " + hufflepuff.getLoyalty() +
                    "; Honesty: " + hufflepuff.getHonesty());
        }
        System.out.println();
    }
    public void print(Ravenclaw[] ravenclaws) {
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Name: " + ravenclaw.getName() +
                    "; Magic power: " + ravenclaw.getMagicPower() +
                    "; Transgression: " + ravenclaw.getTransgression() +
                    "; Cleverness: " + ravenclaw.getCleverness() +
                    "; Wisdom: " + ravenclaw.getWisdom() +
                    "; Wit: " + ravenclaw.getWit() +
                    "; Full ff creative: " + ravenclaw.getFullOfCreative()
            );
        }
        System.out.println();
    }
    public void print(Slytherin[] slytherins) {
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Name: " + slytherin.getName() +
                    "; Magic power: " + slytherin.getMagicPower() +
                    "; Transgression: " + slytherin.getTransgression() +
                    "; Tricky: " + slytherin.getTricky() +
                    "; Determination: " + slytherin.getDetermination() +
                    "; Ambition: " + slytherin.getAmbition() +
                    "; Resourcefulness: " + slytherin.getResourcefulness() +
                    "; Lust for power: " + slytherin.getLustForPower()
            );
        }
        System.out.println();
    }
}