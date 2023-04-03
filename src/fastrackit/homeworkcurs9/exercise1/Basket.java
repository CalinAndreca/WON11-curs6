package fastrackit.homeworkcurs9.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Basket {
    private ArrayList<String> fruits = new ArrayList<>();
    public boolean find(String fruit){
        return fruits.contains(fruit);
    }
    public boolean remove(String fruit){
        return fruits.remove(fruit);
    }
    public int position(String fruit){
        return fruits.indexOf(fruit);
    }
    public Collection<String> distinct(){
        return new ArrayList<>(new HashSet<>(fruits));
    }
    public void add(String fruit){
        fruits.add(fruit);
    }
    public int count(){
        return fruits.size();
    }
    public int customCount(){
        int count = 0;
        for (String fruit : fruits){
            count++;
        }
        return count;
    }
}
