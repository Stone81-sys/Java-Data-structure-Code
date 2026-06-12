import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Tem {


    public static void main(String[] args) {
        int[] arr={1,9,4,3,0,7,2};
        //QuickSort ch=new QuickSort(arr) ;
        //BackSort ch=new BackSort(arr,0,arr.length-1);
        //MaoSort ch=new MaoSort(arr);
        //HeapSort ch=new HeapSort(arr);
        //SelectSort ch=new SelectSort(arr);
        //ChaSort ch=new ChaSort(arr);
        HaxSort ch=new HaxSort(arr,2);
        System.out.println(ch);

    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1=in.next();
        String str2=in.next();
        StringBuffer str3 = new StringBuffer();
        StringBuffer str4 = new StringBuffer();

        for (int i = str1.length()-1; i >=0; i--) {
            char s=str1.charAt(i);
            str3.append(s);

        }
       // System.out.println(str3);
        for (int i = str2.length()-1; i >=0; i--) {
            char s=str2.charAt(i);
            str4.append(s);

        }
        StringBuffer der=new StringBuffer();
        int c=0;
     //   System.out.println(str4);

        StringBuffer tem=str3.length()>str4.length()?str3:str4;
        if(tem==str3){
            for(int i=1;i<Math.abs(str3.length()-str4.length());i++){
                str3.append(0);
            }
        }
        if(tem==str4){
            for(int i=1;i<Math.abs(str3.length()-str4.length());i++){
                str4.append(0);
            }
        }

        for(int i=0;i<tem.length();i++){
            char ter1= str3.charAt(i);
            char ter2= str4.charAt(i);

            if(ter1==0&&ter2==1||ter2==0&&ter1==1){
                der.append(1);

            }else if(ter1==0&&ter2==0){
                if(c==0)
                der.append(0);
                else {
                    der.append(0);
                    c=0;
                }
            }else{
                if(c==0) {
                    der.append(0);
                    c = 1;
                }
                else der.append(0);
            }

        }
        if(c==1){
            der.append(1);
        }

    }
    public static void main1(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        // 注意 while 处理多个 case
        while(true){
            char a = in.nextLine().charAt(0);
          char f=in.next().charAt(0);
            char b = in.nextLine().charAt(0);

            //  System.out.println(a);

            char s=(char)(a+32);
            char k=(char)(b+32);
            System.out.println(s);
            System.out.println(k);
        }
    }
}
