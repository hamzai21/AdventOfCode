import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        // Part One Of Advent of Code Day 1
        FileReader reader = new FileReader("src/input.txt");
        ArrayList<Elf> elves = reader.getElfs();
        Elf max = elves.get(0);
        for (Elf elf : elves) {
            if (elf.totalCalories() > max.totalCalories()) {
                max = elf;
            }
        }
        System.out.println("Elf with the max calories has " + max.totalCalories() + " calories.");

        // Part Two of Advent of Code Day 2
        FileReader partTwoReader = new FileReader("src/input.txt");
        ArrayList<Elf> allElves = partTwoReader.getElfs();
        ArrayList<Elf> topThree = new ArrayList<Elf>();

        /**
         * Calculate the elves with the top three most calories
         */
        for (int i = 0; i < 3; i++) {
            Elf currMax = allElves.get(0);
            for (Elf elf : allElves) {
                if (elf.totalCalories() > currMax.totalCalories()) {
                    currMax = elf;
                }
            }
            topThree.add(currMax);
            allElves.remove(currMax);
        }

        /**
         * Print out the elves with top three calories
         */
        int totalThree = 0;
        System.out.println("The top three calorie carrying elves are: ");
        for (Elf elf : topThree) {
            System.out.println(elf);
            totalThree += elf.totalCalories();
        }
        System.out.println("With a total of " + totalThree + " calories.");



    }
}
