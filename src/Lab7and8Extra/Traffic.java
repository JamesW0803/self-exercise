package Lab7and8Extra;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Traffic {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new FileInputStream("C:\\Users\\user\\Downloads\\Traffic.txt"));
//        String str = "";
//        System.out.println("Welcome!");
//        System.out.println("Truck priority = 2, Car priority = 1, Motorcycle priority = 0");
//        System.out.println("Traffic simulation (Input in this form: 'Vehicle type' 'number of vehicles' '(Priority=X)'): ");
//        System.out.println("Press 'q' to exit");
//        vehicleQueue type = new vehicleQueue(10);
//
//        while (scanner.hasNextLine()) {
//            str = scanner.nextLine();
//            int priorityValue = type.priorityEnqueue(str);
//            System.out.println(str);
//        }
//        scanner.close();
//        System.out.println();
//        type.display();
//    }
//}
//
//class vehicleQueue {
//    String[] arr;
//    int maxSize, head, tail;
//
//    public vehicleQueue(int maxSize) {
//        this.maxSize = maxSize;
//        this.head = 0;
//        this.tail = 0;
//        this.arr = new String[maxSize];
//    }
//
//    public boolean isEmpty() {
//        if (tail == 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean full() {
//        if (tail >= maxSize) {
//            return true;
//        }
//        return false;
//    }
//
//    public String peek() {
//        if (!isEmpty()) {
//            return arr[head];
//        }
//        return "Queue is empty";
//    }
//
//    public String enqueue(String vehicle) {
//        if (!full()) {
//            String temp = vehicle;
//            arr[tail] = vehicle;
//            tail++;
//            return temp;
//        }
//        return "Queue is full";
//    }
//
//    public String dequeue() {
//        if (!isEmpty()) {
//            String temp = arr[head];
//            for (int i = 0; i < tail - 1; i++) {
//                arr[i] = arr[i + 1];
//            }
//            arr[tail - 1] = null;
//            tail--;
//            return temp;
//        }
//        return "Queue is empty, nothing to dequeue";
//    }
//
//    public int priorityEnqueue(String vehicle) {
//        int i;
//        String[] temp = vehicle.split(" ");
//        if (isEmpty()) {
//            enqueue(vehicle);
//        } else {
//            for (i = tail - 1; i >= 0; i--) {
//                String[] str = arr[i].split(" ");
//                if (temp[2].equals(str[2])) {
//                    break;
//                } else if (temp[2].equalsIgnoreCase("(Priority=2)")) {
//                    //System.out.println("Priority check: " + vehicle + ">" + arr[i]);
//                    arr[i + 1] = arr[i];
//                    arr[i] = vehicle;
//                    //System.out.println(2);
//                } else {
//                    if (temp[2].equalsIgnoreCase("(Priority=1)")) {
//                        arr[i + 1] = arr[i];
//                        arr[i] = vehicle;
//                        //System.out.println(1);
//                    } else if (temp[2].equalsIgnoreCase("(Priority=0)")) {
//                        //System.out.println(0);
//                        break;
//                    }
//                }
//            }
//            arr[i + 1] = vehicle;
//            tail++;
//        }
//        return 0;
//    }
//
//    public void display() {
//        if (!isEmpty()) {
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != null) {
//                    System.out.println(arr[i]);
//                }
//            }
//        } else {
//            System.out.println("Nothing to display");
//        }
//    }
//}
