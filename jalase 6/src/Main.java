import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        MyGenericClass<Integer> iObj = new MyGenericClass<Integer>(15);
        System.out.println(iObj.getObject());

        MyGenericClass<String> sObj = new MyGenericClass<String>("String Input");
        System.out.println(sObj.getObject());
        //=====================================================================
        ArrayList<String> names = new ArrayList<>();
        names.add("Reza");
        names.add("ali");
        names.add("hamid");
        names.add("hassan");
        for(String name : names){
            System.out.println(name);
        }
        System.out.println(names.size());
        System.out.println(names.contains("reza"));
        System.out.println(names.contains("ali"));
        //==========================================================
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object
        System.out.println(hash_Set);
        System.out.println(hash_Set.size());
        //System.err.println("error");
        try {
            System.out.println(String.valueOf(System.in.read()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}