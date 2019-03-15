package map;

public class LRUCacheTest {

    public static void main(String[] args) {
        LRUCatch lruCatch=new LRUCatch(3);
        lruCatch.put("1",1);
        lruCatch.put("2",2);
        lruCatch.put("3",3);
        lruCatch.put("4",4);
        System.out.println(lruCatch.toString());
    }



}
