interface first{
    int a = 10;
    int b = 20;

    int add();
}

interface second{
    int x = 30;
    int y = 40;

    int mul();
}

public class MultipleInterface implements first, second{
    public int add(){
        return a + b;
    }

    public int mul(){
        return a * b;
    }

    public static void main(String[] args) {
        MultipleInterface mi = new MultipleInterface();
        System.out.println(mi.add());
        System.out.println(mi.mul());
    }
}
