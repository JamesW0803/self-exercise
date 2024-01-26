package Lab5;


public class Q5 {
    public static void main(String[] args) {
        MyStack <Integer> source = new MyStack<>();
        MyStack <Integer> auxiliary = new MyStack<>();
        MyStack <Integer> target = new MyStack<>();

        int n = 3;
        for (int i = n; i > 0; i--){
            source.push(i);
        }

        System.out.println("Initial State:");
        System.out.println("Source: " + source);
        System.out.println("Auxiliary: " + auxiliary);
        System.out.println("Target: " + target);
        System.out.println();

        moveDisks(source, target, auxiliary, n, "Source", "Target", "Auxiliary");
    }

    public static void moveDisks(MyStack<Integer> source, MyStack<Integer> target, MyStack<Integer> auxiliary, int n, String sourceName, String targetName, String auxiliaryName) {
        if (n == 1) {
            int disk = source.pop();
            target.push(disk);
            System.out.println("Move disk " + disk + " from " + sourceName + " to " + targetName);
            System.out.println(sourceName + ": " + source);
            System.out.println(targetName + ": " + target);
            System.out.println(auxiliaryName + ": " + auxiliary);
            System.out.println();
            return;
        }
        moveDisks(source, auxiliary, target, n - 1, sourceName, auxiliaryName, targetName);

        int disk = source.pop();
        target.push(disk);
        System.out.println("Move disk " + disk + " from " + sourceName + " to " + targetName);
        System.out.println(sourceName + ": " + source);
        System.out.println(targetName + ": " + target);
        System.out.println(auxiliaryName + ": " + auxiliary);
        System.out.println();

        moveDisks(auxiliary, target, source, n - 1, auxiliaryName, targetName, sourceName);
    }
}
