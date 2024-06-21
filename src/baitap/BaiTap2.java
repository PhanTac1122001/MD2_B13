package baitap;

import java.util.HashMap;
import java.util.Map;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] mang ={4,2,13,41,12,12,4,5,7,6,3};
        Map<Integer,Integer> list = new HashMap<>();

        for (int x : mang){
            if(list.containsKey(x)){
                list.remove(x);
            }else {
                list.put(x,1);
            }
        }
        System.out.println(list);
    }
}
