package Starter;

import java.util.*;
import java.util.function.Function;

public class CollectionsInterface
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        String[] name = {"Anna","Bob","Carol","David","Edna"};


     //   addAll(name,list,s -> s);

        // adding all elements of the array to the arrayList
        list.addAll(Arrays.asList(name));
        System.out.println(list);

        // to check if the list has something
        System.out.println("Is Carol in the list? : "+list.contains("Carol"));


        // using remove if with the lambda expressions to remove the elements based on conditions
        list.removeIf(s->s.charAt(0)=='A');
        System.out.println(list);


        Iterator<String> iterator =  list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        char q = 9827;

        System.out.println(q);






    }

    public static void addAll(String[] arr,List<String> list, Function<String,String> function){

        for (String a:arr)
        {
         list.add(function.apply(a));

        }


    }


}
