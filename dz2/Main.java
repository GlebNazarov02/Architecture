package dz2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) throws Exception {
        ItemFabric fab1 = new GoldGenerator();
        fab1.openRewgard();;
        ItemFabric fab2 = new SilverGenerator();
        fab2.openRewgard();
        ItemFabric fab3 = new BronzeGenerator();
        fab3.openRewgard();
        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);

        for(int i=0;i<20;i++)
        {
            int index = (int) (Math.random() * fabricList.size());
            fabricList.get(index).openRewgard();
        }
    }
}