package lesson5;

import java.util.ArrayList;
import java.util.List;

public class BoxStorage {
    private List<HeavyBox> listOfBoxes;

    public BoxStorage(){
        listOfBoxes = new ArrayList<>() ;
    }
    public BoxStorage(ArrayList<HeavyBox> listOfBoxes){

        /*  // this.listOfBoxes = (List<HeavyBox>) listOfBoxes.clone();
        for (int i =0;i<listOfBoxes.size();i++){
            this.listOfBoxes.add(listOfBoxes.get(i));
        }
        */
        this();
        this.listOfBoxes.addAll(listOfBoxes);
    }

    @Override
    public String toString() {
        return "BoxTest{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }

    public boolean changeWeightOfBox(int index,int change){
        boolean result = true;
        if(index<0|| index>listOfBoxes.size()-1) result = false;
        if (!listOfBoxes.get(index).changeWeight(change)) result= false;
      //  listOfBoxes.get(index).setWeight(listOfBoxes.get(index).getWeight() + change);
        return result;
    }

    public HeavyBox[] getArray() {return (HeavyBox[]) listOfBoxes.toArray();}
}
