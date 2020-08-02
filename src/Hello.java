import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World?");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hii?\n Your name is "+name);
        for (int i=1;i<100;i++){
            System.out.println(i+" number ");
        }
    }
}
