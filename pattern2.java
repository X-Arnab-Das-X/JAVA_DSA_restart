// * * * * *
// *       *
// *       *
// *       *
// * * * * *

import java.util.*;
public class pattern2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your row number : ");
        int n = sc.nextInt();

        System.out.print("enter your column number : ");
        int m = sc.nextInt();

        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= m ; j++){
                if (i == 1 || i == n || j == 1 || j ==m){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}