package titan;
import java.util.*;
public class SpeedTest {
    public void process(List <Integer> list)
        {
            for(int i = 0; i<1000000; i++)
                list.add(0,1);
        }
    public static void main(String[] args) 
    {
        //Speed Test: ArrayList, LinkedList
        ArrayList<Integer>arrayList = new ArrayList<Integer>();
        LinkedList<Integer>linkedList = new LinkedList<Integer>();
        
        //Speed Test: HashSet, LinkedHashSet, TreeSet
        HashSet hashset = new HashSet();
        LinkedHashSet linkhashset = new LinkedHashSet();
        TreeSet treeset =  new TreeSet();
        
        long start = System.currentTimeMillis();
        SpeedTest st = new SpeedTest();
        st.process(arrayList);
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time elapsed: "+(end-start));
      
    }
    
}
