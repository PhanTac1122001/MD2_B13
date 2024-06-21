package baitap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BaiTap5 {
    public static void main(String[] args) {
        int[] mang = {4,2,42,31,12,48,2,2,3,4,3,44,2,1};
        Map<Integer, Integer> map = new TreeMap<>();
        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        for (int i : mang) {
            map1.put(i,0);
        }
        System.out.println(map1);
        System.out.println("Phan tu nho nhat: "+ map1.firstKey());
        System.out.println("Phan tu lon nhat: "+ map1.lastKey());
        //xoa ptu lon nhat
        map1.remove(map1.lastKey());

        TreeMap<Integer,Integer> map2 = new TreeMap<>(Comparator.reverseOrder());
        map2.putAll(map1);
        System.out.println(map2);
    }
}
