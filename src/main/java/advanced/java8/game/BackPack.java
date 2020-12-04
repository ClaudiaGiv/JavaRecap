package advanced.java8.game;

import javax.naming.CannotProceedException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BackPack {

    private List<Item> items;
    private int maxWeight;

    public BackPack(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) throws CannotProceedException {
        if (canAddItem(item)) {
            items.add(item);
        } else {
            throw new CannotProceedException("Cannot add item");
        }
    }

    private boolean canAddItem(Item item) {
        int totalItemsWeight = items.stream().map(x -> x.getWeight()).reduce(0, (x,y) -> x+y);
        return totalItemsWeight + item.getWeight() <= maxWeight;
    }

    public Item getItemByName(String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                removeItem(item);
                return item;
            }
        }

        Optional<Item> item = items.stream().filter(item1 -> item1.getName().equals(name)).findFirst();
        return item.orElse(null);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

}
