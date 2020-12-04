package advanced.java8.game;

public class Coin implements Item{

    @Override
    public int getWeight() {
        return 4;
    }

    @Override
    public String getName() {
        return "Coin";
    }


}
