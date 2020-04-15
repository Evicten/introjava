import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args){
        Set<Integer> studentNumbers = new HashSet<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            sc.nextLine();
            studentNumbers.add(number);
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            sc.nextLine();
            studentNumbers.add(number);
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            sc.nextLine();
            studentNumbers.add(number);
        }

        System.out.println("Total students: " + studentNumbers.size());
    }
}
