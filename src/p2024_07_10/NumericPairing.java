package p2024_07_10;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    String x;
    String y;

    Solution(String x, String y){
        this.x = x;
        this.y = y;
    }
    public String action() {
        int[] RedundancyCountX = new int[10];
        int[] RedundancyCountY = new int[10];

        for(int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            RedundancyCountX[c-'0']++;
        }
        for(int i=0; i<y.length(); i++){
            char c = y.charAt(i);
            RedundancyCountY[c-'0']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0 ;i<RedundancyCountX.length; i++) {
            int min = Math.min(RedundancyCountX[i],RedundancyCountY[i]);
            if(RedundancyCountX[i] >= 1 && RedundancyCountY[i] >= 1)
                for(int j=0; j<min; j++) sb.append(i);
        }

        if (sb.length()==0) {
            return "-1";
        }

        String[] name = sb.toString().split("");
        Arrays.sort(name, Comparator.reverseOrder());
        int a = Integer.parseInt(Arrays.stream(name).collect(Collectors.joining()));


        if("0".equals(String.valueOf(a))) return "0";
        else {
            return String.valueOf(a);
        }
    }
}

public class NumericPairing {
    public static void main(String[] args) {
        String x = "100";
        String y = "203045";
        Solution so = new Solution(x, y);
        System.out.println(so.action());

    }
}
