public class returnCal{
    public static void main(String[] args) {
        int a=5;
        int b=7;

        int sum=(a+b);
        System.out.println(" Sum of 5 & 7 is "+sum);

        int sub=(a-b);
        System.out.println(" Diff of 5 & 7 is "+sub);

        int mult=(a*b);
        System.out.println(" Prod of 5 & 7 is "+mult);

        int div=(a/b);
        System.out.println(" Div of 5 & 7 is "+div);
    }
    public static int add(int a ,int b) {
        return a+b;
    }
    public static int sub(int a ,int b) {
        return a-b;
    }
    public static int mult(int a ,int b) {
        return a*b;
    }
    public static int div(int a ,int b) {
        return a/b;
    }
}