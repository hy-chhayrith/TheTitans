package titan;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Comparator 
{
    public int rollNo;
    public String name;
    
    public Comparator(int rollNo, String name){
    this.rollNo=rollNo;
    this.name=name;
}
    @Override
    public String toString(){
        return name + " : " + rollNo;        
    }
    
  public static void main(String[] args) 
  {
      List <Student> list  = new LinkedList<Student>();
      list.add(new Student(123, "Jisoo")); 
     list.add(new Student(125, "Jennie")); 
     list.add(new Student(869, "Rosé")); 
     list.add(new Student(575, "Lisa")); 
      list.add(new Student(123, "Jisoo")); 

      System.out.println("Sort info of the students by their roll numbers");
        Collections.sort(list, new SortByRoll());
        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }
        
       
        
 }
    
}