import java.util.ArrayList;

public class Elf {
    private ArrayList<Integer> food;

    public Elf() {
        food = new ArrayList<Integer>();
    }

    public int totalCalories() {
        int total = 0;
        for (int i = 0; i < food.size(); i++) {
            total += food.get(i);
        }
        return total;
    }

    public void addCalories(int calories) {
        food.add(calories);
    }

    public ArrayList<Integer> getFood() {
        return this.food;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "food=" + food +
                ", total= " + totalCalories() +
                " }";
    }
}
