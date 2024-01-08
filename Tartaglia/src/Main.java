import java.sql.Array;

public class Main {
    public static int[] tartaglia(int n){
        if(n==0){
            return new int[]{1};
        } else {
            int[] tmp = tartaglia(n-1);
            int[] arr = new int[n+1];
            arr[0] = 1;
            System.out.print(arr[0] + " ");
            arr[n] = 1;
            for (int i = 1; i < n; i++) {
                arr[i]=tmp[i-1]+tmp[i];
                System.out.print(arr[i] + " ");
            }
            System.out.println(arr[n] + " ");
            return arr;
        }
    }
    public static void main(String[] args) {
        tartaglia(100);
    }
}