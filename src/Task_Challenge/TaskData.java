package Task_Challenge;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TaskData
{
    private static String tasks= """		
            Infrastructure , Logging , High
            Infrastructure , DB Access ,Medium	
            Infrastructure , Security ,	 High
            Infrastructure , Password Policy , Medium	
            Infrastructure , Task Table	, Medium	
            Infrastructure , Employee Table, Medium	
            Infrastructure , Cross Reference Tables , High	
            Infrastructure , Encryption Policy , High	
            Infrastructure , Write View ,Low	
            Infrastructure , Set Up Users, Low	
            Infrastructure , Set Up Access Policy ,Low			
            Infrastructure , Security  , High
            Infrastructure , Password Policy , Medium ,	 In Progress
            Infrastructure , Cloud solutions , Medium ,	 In Progress
            Infrastructure , Encryption Policy ,High	
            Infrastructure , Project Table , Medium	
            Infrastructure , Write Views ,Low ,	 In Progress
            Infrastructure , Write Views , Low , In Progress		
            Infrastructure , Security ,	 High ,	 In Progress
            Infrastructure , Security ,	 High ,	 In Progress
            Infrastructure , Password Policy ,	 Medium	
            Infrastructure , Encryption Policy , High	
            Infrastructure , Write Views ,Low ,	 In Progress			
            Infrastructure , Logging , High	, In Progress
            Infrastructure , DB Access , Medium	
            Infrastructure , Password Policy , Medium	
            Data Design	, Task Table ,	 High	
            Data Access	, Write Views ,	 Low, assigned
            """;


    private static String annstasks= """
             Infrastructure , DB Access , Medium
            Infrastructure , Password Policy ,Medium
            Data Design	, Task Table ,High
            Data Access	, Write Views , Low, Assigned
            """;

    private static String bobsTasks= """
            Infrastructure , Logging ,High	, In Progress
            Infrastructure , DB Access ,Medium
            Infrastructure , Password Policy , Medium
            Data Design	, Task Table ,	 High
            Data Access	, Write Views ,	 Low
            """;
    private static String carolsTasks= """
            Infrastructure , Logging ,	 High, In Progress
            Infrastructure , DB Access , Medium
            Infrastructure , Password Policy ,	 Medium
            Data Design	, Task Table ,	 High
            Data Access	, Write Views ,	 Low
            """;

    public static Set<Task> getTasks(String owner){

        Set<Task> taskList = new HashSet<>();

        String user = ("bob,carol,ann".contains(owner.toLowerCase()))? owner:null;

        String selectedList = switch (owner.toLowerCase()){
            case "bob"->bobsTasks;
            case "carol"->carolsTasks;
            case "ann"->annstasks;
            default -> tasks;
        };
        for (String taskData:selectedList.split("\n")){
            String[] data = taskData.split(",");
            Arrays.asList(data).replaceAll(String::trim);

           Status status = (data.length<=3)? Status.IN_PROGRESS:
                   Status.valueOf(data[3].toUpperCase().replace(' ','_'));

           Priority priority = Priority.valueOf(data[2].toUpperCase());

           taskList.add(new Task(data[0],user,data[1],priority,status));


        }




        return taskList;



    }




}

//Set<Task> tasksList = new HashSet<>();
//String user = ("ann,bob,carol".contains(owner.toLowerCase()))? owner:null;
//
//String selectedList = switch (owner.toLowerCase()){
//    case "ann"->annstasks;
//    case "carol"-> carolsTasks;
//    case "bob" -> bobsTasks;
//    default -> tasks;
//};
//
//       for(String taskData:selectedList.split("\n")){
//String[] data = taskData.split(",");
//           Arrays.asList(data).replaceAll(String::trim);
//
//Status status = (data.length<=3)?Status.Not_yet_Assigned:Status.valueOf(data[3].toUpperCase().replace(' ','_'));
//
//Priority priority = Priority.valueOf(data[2].toUpperCase());
//
//           tasksList.add(new Task(data[0],data[1],user,priority,status));
//
//        }
//
//
//
//        return tasksList;