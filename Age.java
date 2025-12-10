public class Age{
    public static void main(String[] args) {
        System.out.println("Name- Sanjay");
        int Telugu= 40;
        int English= 45;
        int Hindi= 47;
        int Maths= 46;
        int Social_Studies= 49;
        int Physical_Science= 43;
        int Total= Telugu+English+Hindi+Maths+Social_Studies+ Physical_Science;
        float Marks= Total/ 6;
        System.out.println("Total marks= "+ Total);
        System.out.println("Average Marks= " +Marks);
        if (Marks>=90){
            System.out.println("GRADE= O ");
        }
        else if (Marks>=80){
            System.out.println("GRADE= A ");
        }
        else if (Marks>=70){
            System.out.println("GRADE= B ");
        }
        else if (Marks>=60){
            System.out.println("GRADE= C ");
        }
        else {
            System.out.println("GRADE= FAIL ");
        }
    }
}