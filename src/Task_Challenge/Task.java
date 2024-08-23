package Task_Challenge;

public class Task implements Comparable<Task>
{

 private String assignee;
 private String projectName;
 private String description;
 private Priority priority;
 private Status status;


    public Task(String projectName,String assignee,String description,Priority priority,Status status){
        this.projectName=projectName;
        this.assignee=assignee;
        this.description=description;
    
        this.priority=priority;
        this.status=status;


    }
    public Task(String projectName,String assignee,String description,Priority priority){

        this(projectName,assignee,description,priority,assignee==null? Status.IN_PROGRESS:Status.NoT_YET_ASSIGNED);



    }


    public Task(String projectName, String description, Priority priority)
    {
        this(projectName,description,null,priority,Status.NoT_YET_ASSIGNED);

    }

    public String getAssignee()
    {
        return assignee;
    }

    public String getProjectName()
    {
        return projectName;
    }

    public Priority getPriority(){

        return priority;
    }

    public String getDescription()
    {
        return description;
    }

    public void setAssignee(String assignee)
    {
        this.assignee = assignee;
    }

    public void setProjectName(String projectName)
    {
        this.projectName = projectName;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    @Override
    public int compareTo(Task o)
    {
        int result = this.projectName.compareTo(o.projectName);

        if (result==0){
            result=this.description.compareTo(o.description);


        }
        return result;


    }

    @Override
    public String toString()
    {
        return "%-20s %-25s %10s %10s %s".formatted(priority,description,priority,assignee,status);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;
        return getProjectName().equals(task.getProjectName()) && getDescription().equals(task.getDescription());
    }

    @Override
    public int hashCode()
    {
        int result = getProjectName().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }
}
