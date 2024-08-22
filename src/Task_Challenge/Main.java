package Task_Challenge;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        Set<Task> TaskData = Task_Challenge.TaskData.getTasks("all");
        SortAndPrint("All Tasks",TaskData);



    }

    public static  void SortAndPrint(String header,Collection<Task> collection){
        SortAndPrint(header,collection,null);
    }


    public static void SortAndPrint(String header , Collection<Task> collection, Comparator<Task> comparator){

        String separator= ".-.".repeat(90);
        System.out.println(separator);
        System.out.println(header);
        System.out.println(separator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(comparator);
        list.forEach(System.out::println);

    }
}
