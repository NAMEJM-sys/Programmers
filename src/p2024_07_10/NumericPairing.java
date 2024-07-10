package p2024_07_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Solution{
    String x;
    String y;

    Solution(String x, String y){
        this.x = x;
        this.y = y;
    }

    public String action() {
        StringBuilder sb = new StringBuilder();
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

        for(int i=9;i>=0;i--){
            for(int j=0;j<Math.min(RedundancyCountX[i], RedundancyCountY[i]);j++){
                sb.append(i);
            }
        }

        if(sb.toString().equals("")){
            return "-1";
        }else if(sb.toString().charAt(0)=='0'){
            return "0";
        }

        return sb.toString();
    }

}

public class asdasd {
    public static void main(String[] args) {
        String x = "100";
        String y = "203045";
        Solution so = new Solution(x, y);
        System.out.println(so.action());

    }
}
