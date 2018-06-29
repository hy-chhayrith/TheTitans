
package titan;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class CollectionHarshSet {
    public static void main(String[] args) 
    
    {
        
        //HashSet//
        HashSet hs = new HashSet();
        {
            hs.add("ngjksvndf");
            hs.add("sgihrger");
            hs.add(28334);
            hs.add(1246596);
            hs.add("A");
            hs.add("B");
            hs.add(3.14);
            hs.add(3.14);
            
            System.out.println(hs);
        }
        //LinkedHashSet//
        LinkedHashSet LSH = new LinkedHashSet();
        {
            LSH.add("vnaibver");
            LSH.add(123);
            LSH.add("A");
            LSH.add(3.14);
            
            System.out.println(LSH);
        }
        //Example of runtime exception!//
        //TreeSet is runtime exception//
        //TreeSet
        TreeSet TS = new TreeSet();
        {
            TS.add("Vuthy1");
            TS.add("Vuthy2");
            TS.add("Vuthy12");
            TS.add("Vuthy13");
           
            System.out.println(TS);
        }
    }
    
}
