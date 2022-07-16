public class BinarySearch {
    public static int binarySearch(int[] a,int data){
        return binarySearch(a, data, 0, a.length-1);
        // int middle = a.length / 2;
        // if (middle == a.length || middle == -1)
        //     return -1;
        // System.out.println(middle);
        // if (a[middle] == data)
        //     return middle;
        // else if(a[middle] > data)
        //     return binarySearch(Arrays.copyOfRange(a, 0, middle-1), data);
        // else
        //     return binarySearch(Arrays.copyOfRange(a, middle+1, a.length-1), data);
    }
    public static int binarySearch(int[] a,int data,int start, int end){
        int middle = start + (end-start)/2;
        if (start > end)
            return -1;
        
        if (a[middle] == data)
            return middle;
        else if (a[middle] > data)
            return binarySearch(a, data,start,middle-1);
        else
            return binarySearch(a, data,middle+1,end);
    }

    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        System.out.println(binarySearch(a, 5));
    }
}
