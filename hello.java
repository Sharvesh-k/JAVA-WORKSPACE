import java.util.Scanner;
class hello{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = scan.nextLine();
        System.out.print("Enter score : ");
        Double score = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter dept :  ");
        String dept = scan.nextLine();
        
        System.out.println("Your name is "+name);
        System.out.println("Your score is "+score/10);
        System.out.println("Your dept is "+dept);

        

    }
}