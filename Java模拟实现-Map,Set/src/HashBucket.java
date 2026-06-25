public class HashBucket {

    public static class Node {
        int key;
        Node next;
        int val;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
        Node[] arr;
        private static  final double fuzai=0.75;
        int size=0;

        public  HashBucket(){
            arr=new Node[4];
        }

        //插入
        public boolean put(int key,int val){
            int sit=key % arr.length ;
            Node ter=new Node(key,val);
            if(arr[sit]==null){

                arr[sit]=ter;

            }else{
                //没有重复
                if(repeat(key)){
                    Node tem=arr[sit];
                    while(tem.next!=null) {
                        tem=tem.next;
                    }
                    tem.next=ter;

                }else{//有重复
                    return false;
                }
            }
            size++;
            if(figure()>=fuzai){
                resize();
            }
            return true;
        }

        //获取
        public int get(int key){
                int sit=key % arr.length ;
                if(arr[sit]==null){
                    return -1;
                }else{
                    Node ter=arr[sit];
                    while(ter!=null) {
                        if(ter.key==key){
                            return ter.val;
                        }else {
                            ter=ter.next;
                        }
                    }
                }
                return -1;

            }

        private boolean repeat(int key){
            int sit=key % arr.length ;
                if(arr[key]==null){
                    return true;
                }else{
                    Node ter=arr[key];
                   while(ter!=null) {
                       if(ter.key==key){
                           return false;
                       }else {
                           ter=ter.next;
                       }
                   }
                }
            return true;
        }

        private double figure(){
         return size*1.0/arr.length;
        }

        //扩容
        private void resize(){
            //这里要算新的哈希下标
            Node[] newarr=new Node[arr.length*2];
            for(int i=0;i<arr.length;i++){
                Node ter=arr[i];
                while (ter != null) {
                    Node next=ter.next;
                    ter.next=null;

                    int index=ter.key % newarr.length;
                    if(newarr[index]==null){
                        newarr[index]=ter;

                    }else{
                        Node cur=newarr[index];
                        while (cur.next!=null){

                            cur=cur.next;
                        }
                        cur.next=ter;
                    }
                    ter=next;
                }
            }
            arr=newarr;
        }
}
