package Hashing;

import java.util.*;

public class Integers
{
    public static void main(String[] args)
    {
        Integer a = 10;
        Integer b = 10;
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a==b);

        Integer[] arr = {10,10};
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(10);
        Set<Integer> set = new HashSet<>(List.of(2,2,5,6,7));


        System.out.println(set);
    }
}
