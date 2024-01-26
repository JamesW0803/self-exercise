package Lab2;

import java.sql.Array;
import java.util.Arrays;

public class ArrayBag <T> implements BagInterface <T>  {
    private T[] bag;
    private int DEFAULT_CAPACITY = 25;
    private int numberOfEntries;

    public ArrayBag(){
        this.bag = (T[]) new Object[DEFAULT_CAPACITY];
    }
    public ArrayBag(int capacity){
        this.bag = (T[])new Object[capacity];
    }

    public int getCurrentSize(){
        return numberOfEntries;
    }

    public boolean isFull(){
        return numberOfEntries == DEFAULT_CAPACITY;
    }

    public boolean isEmpty(){
        return numberOfEntries == 0;
    }

    public boolean add(T newEntry){
        if (isFull()){
            return false;
        }
        bag[numberOfEntries] = newEntry;
        numberOfEntries ++;
        return true;
    }

    public T remove(){
        if (isEmpty()){
            return null;
        }
        T removedEntry = bag[numberOfEntries - 1];
        bag[numberOfEntries - 1] = null;
        numberOfEntries --;
        return removedEntry;
    }

    public boolean remove (T anEntry){
        if (isEmpty()){
            return false;
        }
        for (int i = 0 ; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry)){
                T[] newBag = (T[]) new Object [DEFAULT_CAPACITY];
                System.arraycopy(bag,0,newBag,0, i);
                System.arraycopy(bag, i + 1, newBag, i,numberOfEntries - i -1);
                bag = newBag;
                numberOfEntries --;
                return true;
            }
        }
        return false;
    }

    public void clear(){
        Arrays.fill(bag, null);
        numberOfEntries = 0;
    }

    public int getFrequencyOf(T anEntry){
        int frequency = 0;
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry)){
                frequency ++;
            }
        }
        return frequency;
    }

    public boolean contains(T anEntry){
        for (int i = 0; i < numberOfEntries; i++){
            if (bag[i].equals(anEntry)){
                return true;
            }
        }
        return false;
    }

    public T[] toArray(){
        T[] array = (T[])new Object[numberOfEntries];
        System.arraycopy(bag, 0, array, 0, numberOfEntries);
        return array;
    }

    public BagInterface<T> union(BagInterface<T> anotherBag) {
        int resultLength = getCurrentSize() + anotherBag.getCurrentSize();
        ArrayBag<T> result = new ArrayBag<>(resultLength);
        for (T t : this.toArray()){
            result.add(t);
        }
        for (T t : anotherBag.toArray()){
            result.add(t);
        }
        return result;
    }


    public BagInterface <T> intersection (BagInterface <T> anotherBag){
        int resultLength = getCurrentSize();
        ArrayBag <T> result = new ArrayBag<>(resultLength);
        ArrayBag <T> copyAnotherBag = new ArrayBag<>(anotherBag.getCurrentSize());

        for (T t : anotherBag.toArray()){
            copyAnotherBag.add(t);
        }

        for (T t : this.toArray()){
            if (copyAnotherBag.contains(t)){
                result.add(t);
                copyAnotherBag.remove(t);
            }
        }
        return result;
    }

    public BagInterface <T> difference (BagInterface <T> anotherBag){
        ArrayBag <T> result = new ArrayBag<>(getCurrentSize());
        ArrayBag <T> copyAnotherBag = new ArrayBag<>(anotherBag.getCurrentSize());

        for (T t : anotherBag.toArray()){
            copyAnotherBag.add(t);
        }

        for (T t : this.toArray()){
            if (copyAnotherBag.contains(t)){
                copyAnotherBag.remove(t);
            }else{
                result.add(t);
            }
        }
        return result;
    }
}
