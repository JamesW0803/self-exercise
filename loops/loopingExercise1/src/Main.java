public class Main {
    public static void main(String[] args) {
        System.out.println("Using for loop...");
        System.out.println();
        System.out.println("Even numbers between 1 and 100 in ascending order...");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println();

        System.out.println("Even numbers between 1 and 100 in descending order...");
        for(int i = 100; i >= 1; i--){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Using while loop...");
        System.out.println();
        System.out.println("Even numbers between 1 and 100 in ascending order...");
        int i = 0;
        while(i <= 100){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i ++;
        }
        System.out.println();
        System.out.println();

        System.out.println("Even numbers between 1 and 100 in descending order...");
        int j = 100;
        while(j >= 1){
            if (j % 2 == 0){
                System.out.print(j + " ");
            }
            j --;
        }
    }
}