import java.util.Arrays;

public class HeapSort {
    int[] arr;

    @Override
    public String toString() {
        return "HeapSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public  HeapSort(int[] arr){
        this.arr=arr;
        int len=arr.length;
        for (; len >0 ; len--) {
            bigheap(len);
            swap(arr,0,len-1);//收尾交换
        }
    }
    public void bigheap(int len){
        for (int i = (len-1)/2; i >= 0; i--) {
            int lef=i*2+1;
            int rig=i*2+2;
            if(lef>=len){
                continue;
            } else if (rig>=len) {
                if(arr[lef]>arr[i]){
                    swap(arr,lef,i);
                }else continue;

            }else {
                int p=arr[lef]>arr[rig]?lef:rig;
                if(arr[p]>arr[i]){
                    swap(arr,i,p);
                }
            }
        }

    }

public void swap(int[] arr,int i,int j){
        int tem=arr[i];
        arr[i]=arr[j];
        arr[j]=tem;
}


}
