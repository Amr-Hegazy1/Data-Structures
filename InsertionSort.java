import java.util.*;
public class InsertionSort {
    
    public static void sort(int[] a){
        for(int i = 1;i<a.length;i++){
            for(int j = i;j>0;j--){
                if (a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] a = {7,9,65,8,575,8556,7,8,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
