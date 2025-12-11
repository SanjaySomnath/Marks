import java.util.Scanner;

public class ELECTION {
    public static void main(String[] args) {

        int TRS= 467;
        int BJP= 564;
        int INC= 229;
        int JSP= 447;
        int NOTA= 42;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your name:  ");
        String name= sc.nextLine();
        System.out.print("Enter Your Age:  ");
        int age= sc.nextInt();

        if(age>=18) {
            System.out.println("You are eligible to vote");
            System.out.println("The Participants - TRS , BJP , INC , JSP ,NOTA ");
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Place your VOTE- ");
            String Vote=scanner.nextLine();
            if(Vote.equals("BJP")){
                BJP++;
                System.out.println("Leading by "+BJP+" Votes");
            }
            if(Vote.equals("TRS")){
                TRS++;
                System.out.println("Leading by "+TRS+" Votes");
            }
            if(Vote.equals("INC")){
                INC++;
                System.out.println("Leading by "+INC+" Votes");
            }
            if(Vote.equals("JSP")){
                JSP++;
                System.out.println("Leading by "+JSP+" Votes");
            }
            if(Vote.equals("NOTA")){
                NOTA++;
                System.out.println(NOTA+" Votes");
            }
            System.out.println("VOTE is ur Right! Jai Hind");

        }else{
            System.out.println(" You are not eligible to vote");
            }
        System.out.println("");
        }
    }