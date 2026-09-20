import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Initial size of the ArrayList: " + numbers.size());
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Size of the ArrayList after adding elements: " + numbers.size());
        System.out.println("Elements in the ArrayList: " + numbers);
        // for(int x: numbers){
        //     System.out.println(x);
        // }

        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }
}