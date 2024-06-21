package baitap;

import java.util.HashMap;
import java.util.Map;

public class BaiTap1 {
    public static void main(String[] args) {

        //Tim so lan lap trong mang
        int[] mang ={8,8,8,0,34,0,6,5,4,8,5};
        Map<Integer,Integer> list = new HashMap<>();

        for (int x : mang){
            if(list.containsKey(x)){
                Integer value = list.get(x)+1;
                list.put(x,value);
            }else {
                list.put(x,1);
            }
        }
        System.out.println(list);
    }
}
