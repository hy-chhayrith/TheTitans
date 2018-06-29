package titan;
import java.util.ArrayList;
public class ArrayException 
{
    public static void main(String[] args) 
    {
        ArrayList list=new ArrayList();//Creating arraylist
        list.add("Vuthy");//Adding object in arraylist  
        list.add(123);  
        list.add("Channy");  
        list.add(124);  
        System.out.println(list);
        //Adding more element into array
        list.add("Dara");
        list.add(125);
        System.out.println(list);
    }  
}
