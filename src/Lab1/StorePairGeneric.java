package Lab1;

import java.security.cert.CertStoreParameters;

public class StorePairGeneric <E extends Comparable <E>> implements Comparable <StorePairGeneric<E>> {
    private E first, second;

    public StorePairGeneric (E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst(){
        return first;
    }

    public E getSecond(){
        return second;
    }

    public void setPair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return "first = " + first + " second = " + second;
    }

    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        StorePairGeneric <?> other = (StorePairGeneric <?>) obj;
        return first.equals(other.first);
    }

    @Override
    public int compareTo(StorePairGeneric<E> o) {
        return first.compareTo(o.first);
    }

    public static void main(String[] args) {
        StorePairGeneric <Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric <Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric <Integer> c = new StorePairGeneric<>(6,3);

        System.out.println("a.compareTo(b) = " + a.compareTo(b));
        System.out.println("b.compareTo(c) = " + b.compareTo(c));
        System.out.println("c.compareTo(a) = " + c.compareTo(a));

        System.out.println("a.equals(b) = " + a.equals(b));
        System.out.println("b.equals(c) = " + b.equals(c));
        System.out.println("c.equals(a) = " + c.equals(a));
    }
}
