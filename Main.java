/*
 * File Name: Main.java
 *   Created: Feb 08, 2022
 *    Author: 
 */

import java.util.Scanner;

public class Main extends Object
{
  public static void main(String[] args)
  {
      
    System.out.print(Main.part(1));
    // Main.part1();
    // Main.part2();
  }

private static int part(int ppl, int[] time){
  PriorityQueue pq = new PriorityQueue(ppl);

  
}
  
  private static void part0()
  {
    PriorityQueue pq = new PriorityQueue(1);
    
    int c = 0;
    for (int m = 0; m < 33; m++)
    {
      Double x = new Double((int)(100+Math.random()*900));
      System.out.printf("%8s", ""+x);
      if (++c % 6 == 0) System.out.println();     
      pq.add(x);
    }
    c = 0;
    System.out.println("\n\nOrdered by priority:");
    while (!pq.isEmpty())
    {
      System.out.printf("%8s",pq.removeMin());
      if (++c % 6 == 0) System.out.println();
    }
    System.out.println("\n\n");
  }

  private static void part1()
  {
    PriorityQueue<String> pq = new PriorityQueue<>(1);
    Scanner in = new Scanner(Main.class.getResourceAsStream("data1.txt"));
    System.out.println("Adding these words to the priority queue: ");
    int c1 = 0;
    while (in.hasNext())
    {
      String n = in.nextLine();
      System.out.printf("%15s", n);
      if (++c1 % 5 == 0) System.out.println();      
      pq.add(n);
    }
    
    c1 = 0;
    System.out.println("\n\nIn order of priority:");
    while (!pq.isEmpty())
    {
      System.out.printf("%15s (%3s)",pq.removeMin(),c1++);
      if (c1 % 4 == 0) System.out.println();
    }
    System.out.println("\n\n");
  }

  private static void part2()
  {
    PriorityQueue<Task> pq = new PriorityQueue(6);
    Scanner in = new Scanner(Main.class.getResourceAsStream("data2.txt"));
    while (in.hasNext())
    {
      String name = in.nextLine();
      int priority = Integer.parseInt(in.nextLine());
      Task j = new Task(priority, name);
      pq.add(j);
      System.out.println("Added new task: "+j);
    }

    System.out.println("\n\nIn order of priority:");
    while (!pq.isEmpty())
    {
      System.out.println(pq.removeMin());
    }
    System.out.println();
    
  }


}
