import java.util.Arrays;

public class QuickSort {
    private int[] arr;

    @Override
    public String toString() {
        return "QuickSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
//挖坑
    public QuickSort(int[] arr) {
        this.arr=arr;
        int lef=0;
        int rig=arr.length-1;
        //HSort(arr,lef, rig);
        WSort(arr,lef,rig);
    }
    //挖坑
    public void WSort(int[] arr,int i,int j){
        if(j-i<=1)
            return;
        int idv = Wpattern(arr, i, j);
        WSort(arr,i,idv);
        WSort(arr,idv+1,j);
    }
    public int Wpattern(int[] arr,int lef,int rig) {
        int i=lef;
        int j=rig;
        int tem=arr[lef];
        while(i<j){
            while(i<j&&arr[j]>=tem){
                j--;
            }
            arr[i]=arr[j];
            while(i<j&&arr[i]<=tem){
                i++;
            }
            arr[j]=arr[i];
        }
        arr[i]=tem;
        return i;

    }
    //Hoare
    public void HSort(int[] arr,int i,int j){
       if(j-i<=1)
           return;
            int idv = Hpattern(arr, i, j);
            HSort(arr,i,idv);
            HSort(arr,idv+1,j);

    }
   public int Hpattern(int[] arr,int lef,int rig){
        int solid=arr[lef];
        int i=lef;
        int j=rig;
        while(i<j){
            while(i<j&&arr[j]>=solid){
                j--;
            }
            while(i<j&&arr[i]<=solid){
                i++;
            }

            swap(arr,i,j);
        }
        swap(arr,i,lef);
        return i;
    }
    public void swap(int[] arr,int a,int b){
        int tam=arr[a];
        arr[a]=arr[b];
        arr[b]=tam;
    }


}
