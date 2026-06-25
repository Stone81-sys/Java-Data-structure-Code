import java.util.*;

public class UseTreeSet {
    public static void main(String[] args) {
        Set<String> ter=new TreeSet<>();
        //添加元素
        ter.add("你瞅啥");
        ter.add("瞅你咋地");
        ter.add("在干嘛");
        //添加成功返回true，失败，也就是是重复元素的时候，返回false
        System.out.println(ter.add("打电话"));
        System.out.println(ter.add("你瞅啥"));

        //判断原宿是否在集合中
        System.out.println(ter.contains("你瞅啥"));
        System.out.println("------");
        //迭代器
        for (Iterator<String> it = ter.iterator(); it.hasNext(); ) {
            String a = it.next();
            System.out.println(a);
        }
        //删除成功返回true
        System.out.println(ter.remove("你瞅啥"));
        //返回原宿个数
        System.out.println(ter.size());

        //看集合中的元素set里都存不存在，都存在返回true
        LinkedList<String> arr=new LinkedList<>();
        arr.add("打电话");
        arr.add("在干嘛");
        System.out.println(ter.containsAll(arr));//Arrays里面有个.asList数组变列表试试

        //
        LinkedList<String> crr=new LinkedList<>();
        crr.add("打电话");
        crr.add("在上学");
        System.out.println(ter.addAll(crr));

        //将元素转换为数组返回
        Object[] err=ter.toArray();
        System.out.println(Arrays.toString(err));

        //清空
        ter.clear();
        //判断是否为空,为空返回true
        System.out.println(ter.isEmpty());
    }
}
