import java.util.ArrayList;

public class Elf {
    private ArrayList<Integer> food;

    public int totalCalories() {
        int total = 0;
        for (int i = 0; i < food.size(); i++) {
            total += food.get(i);
        }
        return total;
    }

}
