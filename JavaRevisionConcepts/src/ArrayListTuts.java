import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class ArrayListTuts {
    public static void main(String[] args) {


       ArrayList<Integer> numbs = new ArrayList<Integer>();
        numbs.add(2);
        numbs.add(3);
        numbs.add(4);
        numbs.add(66);
        System.out.println(numbs.get(2));

        for(int i:numbs){
            System.out.println(i);
        }


    }
}