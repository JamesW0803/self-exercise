public interface A {
    int a = 10;
    int b = 20;

    int sum();
}

class B implements A{
    public int sum(){
        return a + b;
    }
}

class Main{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println("The sum of a and b is: " + obj.sum());
    }
}


