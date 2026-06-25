public class test {
    public static void main(String[] args) {
//        SearchTree ter=new SearchTree();
//        ter.insert(5);
//        ter.insert(3);
//        ter.insert(8);
//        ter.insert(1);
//        ter.insert(0);
//        ter.insert(9);
//        ter.insert(4);
//        ter.remove(8);
//        ter.remove(3);
//        ter.remove(1);
        //ter.remove(0);
        HashBucket has=new HashBucket();
        has.put(1,9);
        has.put(2,8);
        System.out.println(has.put(2, 8));
        has.put(3,7);
        has.put(4,6);
        has.put(5,5);
        System.out.println(has.get(4));
        System.out.println(has.get(8));


    }
}
