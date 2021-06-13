import java.util.*;

public class Main {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        Collection<T> list = new ArrayList<T>();
        for (T item : collection) {
            if (!list.contains(item)) {
                list.add(item);
            }
        }
        return list;
    }

    public static void main(String []args){
        Collection myCollection = new ArrayList();
        myCollection.add(1);
        myCollection.add(1);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4);
        myCollection.add(6);
        myCollection.add(2);
        myCollection.add(3);
        myCollection.add(4);
        System.out.println(removeDuplicates(myCollection));

    }
}
