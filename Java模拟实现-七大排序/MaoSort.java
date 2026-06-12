import java.util.Arrays;

public class MaoSort {
    int[] arr;

    @Override
    public String toString() {
        return "MaoSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public MaoSort(int[] arr) {
        this.arr=arr;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                }
            }
        }
    }
    public static  void  swap(int[] arr,int j){
        int tem=arr[j+1];
        arr[j+1]=arr[j];
        arr[j]=tem;
    }

}
