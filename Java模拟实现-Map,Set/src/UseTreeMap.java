import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//这里用tree来举例java.util.

public class UseTreeMap {
    public static void main(String[] args) {

        Map<String ,Integer> ter=new TreeMap<>();

        ter.put("你好",4);
        ter.put("我很好",9);
        ter.put("它好吗",14);

        //会得到对应的value
        System.out.println(ter.get("你好"));
        //不存在，返回null
        System.out.println(ter.get("我不好"));

        //看key存不存在，存在返回原本原本的value，不存在返回我输入的默认值，也就是第二个参数
        System.out.println(ter.getOrDefault("它好吗",0));
        System.out.println(ter.getOrDefault("我不好",7));

        //如果有过相同的key，则对应的value会替换掉旧的value
        //value可以等于null,但是key不可以
        ter.put("我很好",56);
        System.out.println(ter.get("我很好"));

        //移除，对应的value会变成null
        ter.remove("你好");
        System.out.println(ter.get("你好"));

        //打印所有的key,不会有重复的
        for(String a: ter.keySet()){
            System.out.println(a);
        }

        //打印所有value，可以有重复的，如果里面存在null,这里会报错
        for(int a: ter.values()){
            System.out.println(a);
        }

        //返回所有映射关系
        for(Map.Entry<String,Integer> a:ter.entrySet()){
            System.out.println(a.getKey()+"-->"+a.getValue());
        }

        //是否包含key
        System.out.println(ter.containsKey("它好吗"));
        System.out.println(ter.containsValue(23));

        //打印当前ter里面的东西和组数
        System.out.println(ter);
        System.out.println(ter.size());
        System.out.println(ter.isEmpty());

    }
}

