/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author hychhayrith
 */
public class LoopInCollection {
    public static void main(String[] args){
        Collection <Integer> collect = new ArrayList<Integer>();
        collect.add(123);
        collect.add(111);
        collect.add(222);
        collect.add(333);
        
        //for loop using for Each
        for(Integer a: collect){
            System.out.println("number: " + a);
        }
        
        CollectionLoopSubclass c1 = new CollectionLoopSubclass("11");
        CollectionLoopSubclass c2 = new CollectionLoopSubclass("22");
        CollectionLoopSubclass c3 = new CollectionLoopSubclass("33");
        CollectionLoopSubclass c4 = new CollectionLoopSubclass("44");
        CollectionLoopSubclass c5 = new CollectionLoopSubclass("44");
        
        Collection <CollectionLoopSubclass> collect1 = new ArrayList<>();
        collect1.add(c1);
        collect1.add(c2);
        collect1.add(c3);
        collect1.add(c4);
        collect1.add(c5);
        
        for(CollectionLoopSubclass b: collect1){
            System.out.println(b);
            System.out.println(b instanceof CollectionLoopSubclass);
        }
        
        
        
        //Another for loop style
        for(Iterator <CollectionLoopSubclass> iter = collect1.iterator(); iter.hasNext();){
            System.out.println(" value: " + iter.next());
            
        }
        
        
        System.out.println("********************************");
        for(Iterator <CollectionLoopSubclass> iter = collect1.iterator(); iter.hasNext();){
//            System.out.println(" value: " + iter.next());
            iter.next();       //This is important to have
            for(Iterator <Integer> iterator = collect.iterator(); iterator.hasNext();){
                System.out.println("value: "+ iterator.next());
            }
        }
       
    }
}