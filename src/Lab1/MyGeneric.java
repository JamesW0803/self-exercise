package Lab1;

public class MyGeneric <E> {
    E e;
    public MyGeneric(){

    }

    public MyGeneric(E e){
        this.e = e;
    }

    public E getE(){
        return e;
    }

    public void setE(E e){
        this.e = e;
    }

    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric<>();
        MyGeneric <Integer> intObj = new MyGeneric<>();

        strObj.setE("James");
        intObj.setE(20);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
