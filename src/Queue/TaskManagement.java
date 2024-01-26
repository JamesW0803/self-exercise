package Queue;

import java.util.*;
class Task{
    String name;
    int priority;
    long arrivalTime;

    public Task(String name, int priority, long arrivalTime){
        this.name = name;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
    }
}
public class TaskManagement {
    PriorityQueue <Task> queue;
    HashMap <String, Task> taskMap;

    public TaskManagement(){
        queue = new PriorityQueue<>(
                (a,b) -> a.priority != b.priority ? b.priority - a.priority : (int)(a.arrivalTime - b.arrivalTime)
        );
        taskMap = new HashMap<>();
    }

    public void addTask(String name, int priority){
        if (taskMap.containsKey(name)){
            Task task = taskMap.get(name);
            if (priority > task.priority){
                queue.remove(task);
                task.priority = priority;
                queue.add(task);
            }
        }else{
            Task task = new Task(name, priority, System.currentTimeMillis());
            queue.add(task);
            taskMap.put(name, task);
        }
    }

    public String completeNextTask(){
        if (queue.isEmpty()){
            return "No Task";
        }else{
            Task task = queue.poll();
            taskMap.remove(task.name);
            return task.name;
        }
    }

    public String peekNextTask(){
        return queue.isEmpty() ? "No Task" : queue.peek().name;
    }

    public void removeTask(String name){
        if (taskMap.containsKey(name)){
            Task task = taskMap.get(name);
            queue.remove(task);
            taskMap.remove(name);
        }
    }
}
