package Lab7and8Extra;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("C:\\Users\\User\\Downloads\\Traffic.txt"));
        String str = "";
        VehicleQueue vehicleQueue = new VehicleQueue();

        while (sc.hasNextLine()){
            str = sc.nextLine();
            vehicleQueue.priorityEnqueue(str);
            System.out.println(str);
        }
        sc.close();
        System.out.println();
        vehicleQueue.display();
    }
}

class VehicleQueue{
    int size = 0;
    int front = 0;
    int rear = -1;
    String[] elements;

    public VehicleQueue(int capacity){
        elements = new String[capacity];
    }

    public VehicleQueue(){
        this(10);
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enqueue(String str){
        if (size == elements.length){
            expandQueue();
        }
        rear = (rear + 1) % elements.length;
        elements[rear] = str;
        size++;
    }

    private void expandQueue() {
        int newCapacity = elements.length * 2;
        String [] newElements = new String[newCapacity];
        for (int i = 0 ; i < size; i++){
            newElements[i] = elements[(front + i) % elements.length];
        }
        elements = newElements;
        front = 0;
        rear = size - 1;
    }

    public String dequeue(){
        if (isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        String str = elements[front];
        elements[front] = null;
        front = (front + 1) % elements.length;
        size--;
        return str;
    }

    public void priorityEnqueue(String vehicle){
        if (size == elements.length){
            expandQueue();
        }

        if (isEmpty()){
            enqueue(vehicle);
        }else{
            int vehiclePriority = getPriority(vehicle);
            int insertIndex = rear;
            while (insertIndex >= front){
                if (elements[insertIndex] == null || getPriority(elements[insertIndex]) >= vehiclePriority) {
                    break;
                }
                elements[(insertIndex + 1) % elements.length] = elements[insertIndex];
                insertIndex --;
            }
            elements[(insertIndex + 1) % elements.length] = vehicle;
            rear = (rear + 1) % elements.length;
            size ++;
        }
    }

    private int getPriority(String vehicle) {
        if (vehicle.contains("(Priority=2)")){
            return 2;
        }else if (vehicle.contains("(Priority=1)")){
            return 1;
        }else{
            return 0;
        }
    }

    public int getSize(){
        return size;
    }

    public void display(){
        if (!isEmpty()){
            for (String element : elements) {
                if (element != null) {
                    System.out.println(element);
                }
            }
        }else{
            System.out.println("Nothing to display.");
        }
    }
}
