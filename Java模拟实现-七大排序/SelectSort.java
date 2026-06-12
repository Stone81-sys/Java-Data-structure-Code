import java.util.Arrays;

public class SelectSort {
    private int[] arr;
    int min=0;

    @Override
    public String toString() {
        return "SelectSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public SelectSort(int[] arr){
        this.arr=arr;
        for (int j = 0; j < arr.length; j++) {
            for (int i = j+1; i < arr.length; i++) {
                if(arr[i]<arr[min]){
                    min=i;
                }
            }
            swap(arr,min,j);

        }
    }

    public void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
    }


}
