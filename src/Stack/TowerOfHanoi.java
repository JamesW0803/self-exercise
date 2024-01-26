package Stack;

public class TowerOfHanoi {
    public void solve (int n, String start, String middle, String end){
        if (n == 1){
            System.out.println(start + "->" + end);
            return;
        }
        solve(n-1, start, end, middle);
        System.out.println(start + "->" + end);
        solve(n-1, middle, start, end);
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.solve(5, "rod A", "rod B", "rod C");
    }
}
