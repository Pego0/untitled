import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        Gryffindor[] gryffindor = {
                new Gryffindor("Harry Potter", generate(), generate(), generate(), generate(), generate()),
                new Gryffindor("Ron Weasley", generate(), generate(), generate(), generate(), generate()),
                new Gryffindor("Hermione Granger", generate(), generate(), generate(), generate(), generate()),
        };
        Slytherin[] slytherins = {
                new Slytherin("Draco Malfoy", generate(), generate(), generate(), generate(), generate(), generate(), generate()),
                new Slytherin("Graham Montagu", generate(), generate(), generate(), generate(), generate(), generate(), generate()),
                new Slytherin("Gregory Goyle", generate(), generate(), generate(), generate(), generate(), generate(), generate()),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Zachariah Smith", generate(), generate(), generate(), generate(), generate()),
                new Hufflepuff("Cedric Diggory", generate(), generate(), generate(), generate(), generate()),
                new Hufflepuff("Justin Finch-Fletchley", generate(), generate(), generate(), generate(), generate()),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Zhou Chang", generate(), generate(), generate(), generate(), generate(), generate()),
                new Ravenclaw("Padma Patil", generate(), generate(), generate(), generate(), generate(), generate()),
                new Ravenclaw("Marcus Belby", generate(), generate(), generate(), generate(), generate(), generate()),
        };
        Hogwarts[] hogwarts = {
                new Hogwarts("Harry Potter", gryffindor[0].getMagicPower(), gryffindor[0].getTransgression()),
                new Hogwarts("Hermione Granger", gryffindor[2].getMagicPower(), gryffindor[2].getTransgression()),
                new Hogwarts("Ron Weasley", gryffindor[1].getMagicPower(), gryffindor[1].getTransgression()),
                new Hogwarts("Draco Malfoy", slytherins[0].getMagicPower(), slytherins[0].getTransgression()),
                new Hogwarts("Graham Montagu", slytherins[1].getMagicPower(), slytherins[1].getTransgression()),
                new Hogwarts("Gregory Goyle", slytherins[2].getMagicPower(), slytherins[2].getTransgression()),
                new Hogwarts("Zachariah Smith", hufflepuffs[0].getMagicPower(), hufflepuffs[0].getTransgression()),
                new Hogwarts("Cedric Diggory", hufflepuffs[1].getMagicPower(), hufflepuffs[1].getTransgression()),
                new Hogwarts("Justin Finch-Fletchley", hufflepuffs[2].getMagicPower(), hufflepuffs[2].getTransgression()),
                new Hogwarts("Zhou Chang", ravenclaws[0].getMagicPower(), ravenclaws[0].getTransgression()),
                new Hogwarts("Padma Patil", ravenclaws[1].getMagicPower(), ravenclaws[1].getTransgression()),
                new Hogwarts("Marcus Belby", ravenclaws[2].getMagicPower(), ravenclaws[2].getTransgression()),
        };
        PrintService printService = new PrintService();
        printService.print(gryffindor);
        printService.print(slytherins);
        printService.print(hufflepuffs);
        printService.print(ravenclaws);
        bestGryffindor(gryffindor);
        bestSlytherin(slytherins);
        bestHufflepuffr(hufflepuffs);
        bestRavenclaw(ravenclaws);
        hogwarts[0].compareBetween(hogwarts[3]);

    }
    private static int generate() {
        return RANDOM.nextInt(100);
    }
    public static void bestGryffindor(Gryffindor[] gryffindors) {
        int sumHarry = gryffindors[0].getBravery() + gryffindors[0].getHonor() + gryffindors[0].getNobility();
        int sumHermione = gryffindors[1].getBravery() + gryffindors[1].getHonor() + gryffindors[1].getNobility();
        int sumRon = gryffindors[2].getBravery() + gryffindors[2].getHonor() + gryffindors[2].getNobility();
        if (sumHarry > sumHermione && sumHarry > sumRon) {
            System.out.println("Harry Potter is the best Gryffindor student");
        } else if (sumHermione > sumHarry && sumHermione > sumRon) {
            System.out.println("Hermione Granger is the best Gryffindor student");
        } else if (sumRon > sumHarry && sumRon > sumHermione){
            System.out.println("Ron Weasley is the best Gryffindor student");
        }
    }
    public static void bestHufflepuffr(Hufflepuff[] hufflepuffs) {
        int sumZachariah = hufflepuffs[0].getIndustriousness() + hufflepuffs[0].getLoyalty() + hufflepuffs[0].getHonesty();
        int sumCedric = hufflepuffs[1].getIndustriousness() + hufflepuffs[1].getLoyalty() + hufflepuffs[1].getHonesty();
        int sumJustin = hufflepuffs[2].getIndustriousness() + hufflepuffs[2].getLoyalty() + hufflepuffs[2].getHonesty();
        if (sumZachariah > sumCedric && sumZachariah > sumJustin) {
            System.out.println("Zachariah Smith is the best Hufflepuff student");
        } else if (sumCedric > sumZachariah && sumCedric > sumJustin) {
            System.out.println("Cedric Diggory is the best Hufflepuff student");
        } else if (sumJustin > sumZachariah && sumJustin > sumCedric){
            System.out.println("Justin Finch-Fletchley is the best Hufflepuff student");
        }
    }
    public static void bestRavenclaw(Ravenclaw[] ravenclaws) {
        int sumZhou = ravenclaws[0].getCleverness() + ravenclaws[0].getWit() + ravenclaws[0].getWisdom() + ravenclaws[0].getFullOfCreative();
        int sumPadma = ravenclaws[1].getCleverness() + ravenclaws[1].getWit() + ravenclaws[1].getWisdom() + ravenclaws[1].getFullOfCreative();
        int sumMarcus = ravenclaws[2].getCleverness() + ravenclaws[2].getWit() + ravenclaws[2].getWisdom() + ravenclaws[2].getFullOfCreative();
        if (sumZhou > sumPadma && sumZhou > sumMarcus) {
            System.out.println("Zhou Chang is the best Ravenclaw student");
        } else if (sumPadma > sumZhou && sumPadma > sumMarcus) {
            System.out.println("Padma Patil is the best Ravenclaw student");
        } else if (sumMarcus > sumZhou && sumMarcus > sumPadma){
            System.out.println("Marcus Belby is the best Ravenclaw student");
        }
    }
    public static void bestSlytherin(Slytherin[] slytherins) {
        int sumDraco = slytherins[0].getTricky() + slytherins[0].getDetermination() + slytherins[0].getAmbition() + slytherins[0].getResourcefulness() + slytherins[0].getLustForPower();
        int sumGraham = slytherins[1].getTricky() + slytherins[1].getDetermination() + slytherins[1].getAmbition() + slytherins[1].getResourcefulness() + slytherins[1].getLustForPower();
        int sumGregory = slytherins[2].getTricky() + slytherins[2].getDetermination() + slytherins[0].getAmbition() + slytherins[2].getResourcefulness() + slytherins[2].getLustForPower();
        if (sumDraco > sumGraham && sumDraco > sumGregory) {
            System.out.println("Draco Malfoy is the best Slytherin student");
        } else if (sumGraham > sumDraco && sumGraham > sumGregory) {
            System.out.println("Graham Montague is the best Slytherin student");
        } else if (sumGregory > sumDraco && sumGregory > sumGraham){
            System.out.println("Gregory Goyle is the best Slytherin student");
        }
    }
}