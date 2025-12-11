import java.util.Scanner;
public class factorial {
      public static int factor(int a){
            if (a==0){
                return 1;
            } else if (a==1){
                return 1;
            } else {
                return a*factor(a-1);
            }
        }
        public static void main(String[] args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int result=factor(a);
         System.out.print("Factorial of " + a + " is " + result);
        }
    }