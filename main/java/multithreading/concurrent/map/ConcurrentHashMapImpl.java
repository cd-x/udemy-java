package main.java.multithreading.concurrent.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImpl {
    private static final Map<String, String> cache = new ConcurrentHashMap<>();
    public static void main(String[] args) {

        for(int i=0;i<10;i++){
            final int finalI = i;
            new Thread(() ->{
                String key = "Key @ " + finalI;
                for(int j=0;j<5;j++){
                    String value = getCachedVal(key);
                    System.out.printf("Thread: %s fetched {key, value} as [%s, %s]\n",
                            Thread.currentThread().getName(), key, value );
                }
            }).start();
        }
    }
    private static String getCachedVal(String key){
        if(!cache.containsKey(key)){
            cache.put(key, compute(key));
        }
        return cache.get(key);
    }
    private static String compute(String key){
        System.out.println("Cache miss for key: "+key);
        return "v#" + key;
    }
}
