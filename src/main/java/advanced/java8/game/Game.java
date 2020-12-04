package advanced.java8.game;

import java.util.stream.Collectors;

public class Game {

    public static void main (String[] args) {

        BackPack backPack = new BackPack(15);

        Coin coin = new Coin();

        addItemInBackpack(backPack, coin);

        Item arrow = new Item() {
            @Override
            public int getWeight() {
                return 5;
            }

            @Override
            public String getName() {
                return "Arrow";
            }
        };

        Item sword = new Item() {
            @Override
            public int getWeight() {
                return 7;
            }

            @Override
            public String getName() {
                return "Sword";
            }
        };

        addItemInBackpack(backPack, arrow);
        addItemInBackpack(backPack, sword);

        System.out.println(backPack.getItems().stream().map(item -> item.getName()).collect(Collectors.joining(", ")));

    }

    private static void addItemInBackpack(BackPack backpack, Item item){
        try{
            backpack.addItem(item);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }






}
