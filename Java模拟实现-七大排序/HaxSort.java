import java.util.Arrays;

public class HaxSort {
    private int[] arr;

    @Override
    public String toString() {
        return "HaxSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public HaxSort(int[] arr,int k) {
        this.arr = arr;
        int len = arr.length;
        int tab = len / k;
        for (; tab > 0; tab /= k) {

            for (int p = 0; p <= len-1-tab ; p++) {
                for(int i=p;i>=0 ;i-=tab) {
                    if (arr[i] > arr[i + tab]) {
                        swap(arr, i, i + tab);
                    }else break;
                }
            }
        }
    }
    public void swap(int[] arr,int a,int b){
        int tam=arr[a];
        arr[a]=arr[b];
        arr[b]=tam;
    }


}
