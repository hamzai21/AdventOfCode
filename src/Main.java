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
    }
}
