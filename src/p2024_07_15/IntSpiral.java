package p2024_07_15;

import java.util.Arrays;
import java.util.Scanner;

public class IntSpiral {
    static int[][] SpirCalculator(int n){
        int[][] spir = new int[n][n];
        int avg = n/2;
        if(n%2 ==0) {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    for (int j = 0; j <= n - 1; j++) {
                        spir[i][j] = (j + 1);
                    }
                } else if (i == n - 1) {
                    for (int j = 0; j <= n - 1; j++) {
                        spir[i][j] = n * n - (n - 1) * (n - 1) + (i - j);
                    }
                } else if (i < avg && i > 0) {
                    for (int j = i - 1; j <= n - (i + 1); j++) {
                        spir[i][j] = n * n - (n - (2 * i)) * (n - (2 * i)) + j - (i - 1);
                    }
                } else if (i >= avg && i < n - 1) {
                    for (int j = n - (i + 1); j <= i; j++) {
                        spir[i][j] = n * n - (2 * (i - avg) + 1) * (2 * (i - avg) + 1) + i - j;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    for (int j = 0; j <= n - 1; j++) {
                        spir[i][j] = (j + 1);
                    }
                } else if (i == n - 1) {
                    for (int j = 0; j <= n - 1; j++) {
                        spir[i][j] = n * n - (n - 1) * (n - 1) + (i - j);
                    }
                } else if (i <= avg && i > 0) {
                    for (int j = i - 1; j <= n - (i + 1); j++) {
                        spir[i][j] = n * n - (n - (2 * i)) * (n - (2 * i)) + j - (i - 1);
                    }
                } else if (i > avg && i < n - 1) {
                    for (int j = n - (i + 1); j <= i; j++) {
                        spir[i][j] = n * n - (2 * (avg-i)) * (2 * (avg-i)) + i-j;
                    }
                }
            }
        }

        if(n%2 == 0) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    for (int i = 1; i < n; i++) {
                        spir[i][j] = n * n - (n - 2) * (n - 2) + (1 - i);
                    }
                }else if(j == n-1) {
                    for(int i= 1; i<n; i++){
                        spir[i][j] = n * n - (n - 1) * (n - 1) + (i - (n-1));
                    }
                }else if(j < avg && j >= 1) {
                    for(int i=(2+j); i<n-(2+(j-1)); i++){
                        spir[i][j] = n * n - (n- 2*(1+j))*(n-2*(1+j)) -(i-(j+1));
                    }
                }else if(j>avg && j<n-1) {
                    for(int i = avg-(j-avg); i<j; i++){
                        spir[i][j]= n*n - (2*(j-avg)+1)*(2*(j-avg)+1)+ (i-j);
                    }
                }

            }
        }else {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    for (int i = 1; i < n; i++) {
                        spir[i][j] = n * n - (n - 2) * (n - 2) + (1 - i);
                    }
                }else if(j == n-1) {
                    for(int i= 1; i<n; i++){
                        spir[i][j] = n * n - (n - 1) * (n - 1) + (i - (n-1));
                    }
                }else if(j < avg-1 && j >= 1) {
                    for(int i=(2+j); i<n-2-(j-1); i++){
                        spir[i][j] = n*n - (n-2*(1+j))*(n-2*(1+j)) + ((j+1)-i);
                    }
                }else if(j>avg && j<n-1){
                    for (int i=avg-(j-avg); i<j; i++){
                        spir[i][j] = n*n - (2*(j-avg))*(2*(j-avg)) + (i-j);
                    }
                }

            }
        }

        return spir;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i =0; i<num; i++){
            int[] Array = new int[num];
            for (int j=0; j<num; j++) {
                Array[j] = SpirCalculator(num)[i][j];
            }
            System.out.println(Arrays.toString(Array));
        }
    }
}
