import java.util.Scanner;

public class pattern_div2 {
    
    public static void rectanglePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    public static void Right_Angled_Triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }





    public static void Right_Angled_Number_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }






    public static void Right_Angled_Number_repeat(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }




    public static void Inverted_Right_Pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void Hollow_Square_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of pattern: ");
        int n = sc.nextInt();

        System.out.println("Rectangle * Pattern:");
        rectanglePattern(n);
        
        System.out.println("\n Right Angled Triangle:");
        Right_Angled_Triangle(n);

        System.out.println("\nRight Angled Number Pyramid:");
        Right_Angled_Number_Pyramid(n);

        System.out.println("\nInverted Right Pyramid:");
        Inverted_Right_Pyramid(n);

        System.out.println("\nHollow Square Pattern:");
        Hollow_Square_Pattern(n);
        
        
        sc.close();
    }






        
}
