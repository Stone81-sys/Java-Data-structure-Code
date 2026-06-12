import java.util.Arrays;

public class BackSort {
    private int[] arr;

    @Override
    public String toString() {
        return "BackSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public BackSort(int[] arr,int lef,int rig) {
        this.arr = arr;
        //递归
        //back(arr,lef,rig);
        //非递归
        back(arr);

    }
    //非递归
    public void back(int[] arr) {
        int gap=1;
        while(gap < arr.length) {
            for (int i = 0; i < arr.length; i += 2*gap) {
                int lef = i;
                int min =lef+gap-1;
                int rig=min+gap;
                if (rig >= arr.length) {
                    rig = arr.length - 1;
                }

                if (min >= arr.length) {
                    min = arr.length - 1;
                }
                gui(arr, lef, min, rig);
            }
            gap *= 2;
        }
    }

    //递归
  public void back(int[] arr,int lef,int rig){
      int min=(rig+lef)/2;
      if(rig<=lef){
          return;
      }
      back(arr,lef,min);
      back(arr,min+1,rig);
      gui(arr,lef,min,rig);
  }
  //组内排序
    public void gui(int[] arr,int lef,int min,int rig){
        int[] tem=new int[rig-lef+1];
        int k=0;
        int i=lef;
        int j=min+1;
        while (i<=min&&j<=rig){
            tem[k++]=arr[i]<arr[j]?arr[i++]:arr[j++];
        }
        while(i<=min){
            tem[k++]=arr[i++];
        }
        while (j<=rig){
            tem[k++]=arr[j++];
        }
        for (int l = 0; l < tem.length; l++) {
            arr[lef+l]=tem[l];
        }
    }


}
