package Stack;

public class MyStack <E>  {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize(){
        return list.size();
    }

    public void push(E e){
        list.add(e);
    }

    public E pop(){
        E e = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return e;
    }

    public E peek(){
        return list.get(getSize() - 1);
    }

    public int search(E e){
        for (int i = 0; i <= getSize(); i++){
            if (list.get(i).equals(e)){
                return i;
            }
        }
        return 0;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
    public static void main(String[] args) {
        MyStack <Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.peek();
        stack.pop();
        int index = stack.search(3);
        System.out.println(index);
        stack.isEmpty();
    }
}
