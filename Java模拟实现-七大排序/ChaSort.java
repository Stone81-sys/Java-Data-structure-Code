import java.util.Arrays;

public class ChaSort {

private int[] arr;

    @Override
    public String toString() {
        return "ChaSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public ChaSort(int[] arr){
        this.arr=arr;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                int jap=arr[j];
                int tem=arr[j+1];
                if(jap>tem){
                    swap(arr,j);
                }else break;

            }
        }

    }

    public void swap(int[] arr,int j){
        int tem=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=tem;
    }
}

