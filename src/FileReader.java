import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class FileReader {
    private Scanner reader;
    private ArrayList<Elf> elves;

    /**
     * Constructor Reads File and Parses Each Calorie Count Into Elf Object
     * @param fileName Name of the file containing the calorie count
     * @throws FileNotFoundException exception thrown when invalid file name
     */
    public FileReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        reader = new Scanner(file);
        elves = new ArrayList<Elf>();

        Elf curr = new Elf();
        while(reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.equals("") && reader.hasNextLine()) {
                ArrayList<Integer> currElf = curr.getFood();
                Elf elf = new Elf();
                for (int i = 0; i < currElf.size(); i++) {
                    elf.addCalories(currElf.get(i));
                }
                elves.add(elf);
                curr = new Elf();
            }
            else if(!line.equals("") && !reader.hasNextLine()) {
                curr.addCalories(Integer.parseInt(line));
                elves.add(curr);
            }
            else {
                curr.addCalories(Integer.parseInt(line));
            }
        }
        reader.close();
    }

    /**
     * Gets the list of elves
     * @return the array list of elves
     */
    public ArrayList<Elf> getElfs(){
        return this.elves;
    }


}
