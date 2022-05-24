public class Task implements Comparable
{
  private String name;
  private int priority;

  public Task(int x, String name1)
  {
     priority = x;
     name = name1;  

  }

  @Override 
  public String toString(){
    // String s = "";
    // s = ;
    return name + " " + priority;
  }

  @Override
  public int compareTo(Object y){
    Task x = (Task) y; 
    // x = new Task<>(x, name1);
    if (this.priority > x.priority) return 1;
    else if (this.priority < x.priority){
      return -1;
    }
    else{return 0;}

  }
}


 
      