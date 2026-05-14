import java.util.*;
public class forLoop{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your limit : ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            System.out.println(i);
        }
        
    }
}