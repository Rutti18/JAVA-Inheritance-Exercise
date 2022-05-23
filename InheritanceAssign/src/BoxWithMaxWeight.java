import java.util.ArrayList;

// Exercise 3

//PArt 2 : Box with a max weight
public class BoxWithMaxWeight extends Box {
    private int maxWeight;
    private ArrayList<Item> items; //store items in arraylist

    //constructor with one argument
    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!isMaxReach(item.getWeight())) {
            items.add(item);
        }
    }

    @Override
    public void add(String name, int weight) {
        if (!isMaxReach(weight)) {
            items.add(new Item(name, weight));
        }
    }

    
    public boolean isMaxReach(int item) {
        if (sumWeight() + item > this.maxWeight) {
            return true;
        }
        return false;
    }

    public int sumWeight() {
        int sum = 0;
        if (items.size() > 0) {
            for (Item item : items) {
                sum += item.getWeight();
            }
        }

        return sum;
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.items.contains(item)){
            return true;
        }
        return false;
    }

}