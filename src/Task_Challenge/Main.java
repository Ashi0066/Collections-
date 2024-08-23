package Task_Challenge;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {

        Set<Task> TaskData = Task_Challenge.TaskData.getTasks("all");
        SortAndPrint("All Tasks",TaskData);
        Set<Task> carolData = Task_Challenge.TaskData.getTasks("carol");
        SortAndPrint("Carols Tasks",carolData);
        Set<Task> annsData = Task_Challenge.TaskData.getTasks("ann");
        SortAndPrint("ANNS Tasks",annsData);

        Comparator<Task> sortByPriority = Comparator.comparing(Task::getPriority);
        Set<Task> bobsData = Task_Challenge.TaskData.getTasks("bob");
        SortAndPrint("Bobs Tasks",bobsData,sortByPriority);


       Set<Task> union =  getUnionSet(annsData, bobsData);

        SortAndPrint("bob and anns union ", union);



    }

    public static  void SortAndPrint(String header,Collection<Task> collection){
        SortAndPrint(header,collection,null);
    }


    public static void SortAndPrint(String header , Collection<Task> collection, Comparator<Task> comparator){

        String separator= ":-:".repeat(50);
        System.out.println(separator);
        System.out.println();
        System.out.print(" ".repeat(40));
        System.out.println(header);
        System.out.println();
        System.out.println(separator);

        List<Task> list = new ArrayList<>(collection);
        list.sort(comparator);
        list.forEach(System.out::println);

    }

    // 

    public static Set<Task> getUnionSet(Collection<Task> employee1,Collection<Task> employee2){

        Set<Task> union = new HashSet<>(employee1);

        union.addAll(employee2);
        return union; 

        



    }
}
