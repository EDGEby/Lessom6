package lesson5;


public class HeavyBox {
    private int weight;

    public HeavyBox(){weight=0;}

    public HeavyBox(int weight){this.weight=weight;}

    @Override
    public String toString() {
        return "Box weight " + weight + ' ';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean changeWeight(int change){
        boolean result =true;
        if (weight + change <= 0) result = false;
        else weight += change;
        return result;
    }
}
