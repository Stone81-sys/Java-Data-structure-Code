public class SearchTree {
    public static class Node{
        int key;
        Node left;
        Node rigth;

        public Node(int a){
            this.key=a;
        }

    }

    private Node root =null;

    //查找
    public Node search(int a){
        Node ter=root;
        while(ter!=null ){
            if (ter.key == a) {
                return ter;
            } else if (a > ter.key) {
                ter = ter.rigth;
            } else {
                ter = ter.left;
            }
        }
        return null;
    }

    //插入
    public boolean insert(int a){
        if(root==null){
            root=new Node(a);
            return true;
        }
        int wa=0;//rigth
        int we=0;//left

        Node ter=root;
        Node parent=root;
        while(ter!=null){
            if (ter.key == a) {
                return false;
            } else if (a > ter.key) {
                parent=ter;
                ter = ter.rigth;
                wa=1;
                we=0;
            } else {
                parent=ter;
                ter = ter.left;
                wa=0;
                we=1;
            }
        }
        Node der=new Node(a);
        if(wa==1){
            parent.rigth=der;
        }else{
            parent.left=der;
        }
        return true;
    }

    //删除
    public boolean remove(int a){
        Node parent=null;
        Node ter=root;
        while(ter!=null ){
            if (ter.key == a) {
                break;
            } else if (a > ter.key) {
                parent=ter;
                ter = ter.rigth;
            } else {
                parent=ter;
                ter = ter.left;
            }
        }
        if(ter == null){
            return false;
        }

        Node cur=ter;

        while(cur!=null) {
            if (cur.rigth != null && cur.left != null) {
                parent = cur;
                cur = cur.rigth;
            } else if (cur.left!=null) {
                parent = cur;
                cur=cur.left;
            } else if (cur.rigth!=null) {
                parent = cur;
                cur=cur.rigth;
            }else {
                break;
            }
        }
        ter.key= cur.key;
         if(parent.left==cur){
             parent.left=null;
         }else {
             parent.rigth=null;
         }
        return true;
    }

}













