package builderdesignpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivek on 15/2/17.
 */
public class CDType {

    private List<Packing> items = new ArrayList<>();

    public void addItem(Packing packing){
        items.add(packing);
    }

    public void getCost(){
        for(Packing packs:items)
            packs.price();
    }

    public void showItems(){
        for(Packing packs:items){
            System.out.println("CD Name: "+packs.pack()+" | price: "+packs.price());
        }
    }
}
