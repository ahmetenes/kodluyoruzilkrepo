import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    public int id;
    public String name;
    public double cgpa;
    public Student(String _name,double _cgpa,int _id){
        this.name = _name;
        this.id = _id;
        this.cgpa = _cgpa;
    }
    public String getName() {
        return this.name;
    }
 }
  class Priorities {
     public List<Student> getStudents(List<String> events){
         Queue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                int result = Double.compare(a.cgpa, b.cgpa)*-1;
                if(result == 0){
                    result = a.name.compareTo(b.name);
                    if (result == 0){
                        result = Integer.compare(a.id,b.id);
                    }
                }
                return result;
            }
         });
         for (String event : events) {
             String[] eventTokens = event.split(" ");

             if (eventTokens[0].compareTo("ENTER") == 0) {
                 queue.add(new Student(eventTokens[1],Double.parseDouble(eventTokens[2]),Integer.parseInt(eventTokens[3])));
             }else if(eventTokens[0].compareTo("SERVED")== 0){
                queue.poll();
             }
         }
         List<Student> finalList = new ArrayList<>();
         while (!queue.isEmpty()) {
            finalList.add(queue.poll());
         }
         return finalList;
     }
 }


public class Test {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}